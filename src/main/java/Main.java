import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(" Anti Gravity SkyRacer 1B", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 2B", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer  3Q", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 4Z", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 5I", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 6Y", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 7H", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 8R", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 9U", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 10W", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 11P", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 12J", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 13B", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 14X", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 15N", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 16oS", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 17ED", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 18JT", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 19RV", 100, 10, 5));
        vehicles.add(new Vehicle("Anti Gravity SkyRacer 20HD", 106, 10, 5));
        // Add other vehicles...

        // Simulate the race
        AntiGravityRacingGame.simulateRace(vehicles);

        // Display the race results
        AntiGravityRacingGame.displayRaceResults(vehicles);
    }
}
