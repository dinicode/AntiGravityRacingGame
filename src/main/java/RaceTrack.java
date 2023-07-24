import java.util.ArrayList;
import java.util.List;

public class RaceTrack {
    private int trackLength; // Total length of the race track
    private List<Vehicle> vehicles; // List of vehicles participating in the race

    public RaceTrack(int trackLength) {
        this.trackLength = trackLength;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void simulateRace(int raceDuration, int lapsToComplete) {
        for (int time = 1; time <= raceDuration; time++) {
            for (Vehicle vehicle : vehicles) {
                int distanceCovered = vehicle.getDistanceCovered(time);

                // Check for a lap completion
                if (distanceCovered >= (vehicle.getLapsCompleted() + 1) * trackLength) {
                    vehicle.completeLap();
                    System.out.println(vehicle.getName() + " completed lap " + vehicle.getLapsCompleted());
                }

                // Check for a winner
                if (vehicle.getLapsCompleted() == lapsToComplete) {
                    System.out.println(vehicle.getName() + " wins the race!");
                    return;
                }
            }
        }

        System.out.println("The race ended in a tie!");
    }

    // Method to check if the vehicle has crossed track boundaries
    private void checkBoundaries(Vehicle vehicle) {
        if (vehicle.getDistanceCovered(0) < 0) {
            // Vehicle went beyond the starting point, reset its position
            // ...
        } else if (vehicle.getDistanceCovered(0) >= trackLength) {
            // Vehicle crossed the finish line, reset its position
            // ...
        }
    }
}
