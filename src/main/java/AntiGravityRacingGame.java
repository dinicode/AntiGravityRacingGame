import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AntiGravityRacingGame {
    public static void simulateRace(List<Vehicle> vehicles) {
        int raceDuration = 100;
        int lapsToComplete = 5;

        for (int time = 1; time <= raceDuration; time++) {
            for (Vehicle vehicle : vehicles) {
                int distanceCovered = vehicle.getDistanceCovered(time);

                // Check for a lap completion
                if (distanceCovered >= (vehicle.getLapsCompleted() + 1) * 200) {
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

    public static void displayRaceResults(List<Vehicle> vehicles) {
        // Sort the vehicles based on their final laps completed
        Collections.sort(vehicles, (v1, v2) -> Integer.compare(v2.getLapsCompleted(), v1.getLapsCompleted()));

        // Display the results
        System.out.println("Race Results:");
        int position = 1;
        for (Vehicle vehicle : vehicles) {
            System.out.println(position + ". " + vehicle.getName() + " - Laps Completed: " + vehicle.getLapsCompleted());
            position++;
        }
    }
}
