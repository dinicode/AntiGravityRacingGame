import java.util.ArrayList;
import java.util.List;

public class PowerUpsAndBoosts {
    private List<PowerUp> powerUps;

    public PowerUpsAndBoosts() {
        powerUps = new ArrayList<>();
        // Initialize the available power-ups here (optional)
    }

    public void addPowerUp(PowerUp powerUp) {
        powerUps.add(powerUp);
    }

    public void applyPowerUp(Vehicle vehicle) {
        // Apply a randomly chosen power-up to the specified vehicle
        if (!powerUps.isEmpty()) {
            int randomIndex = (int) (Math.random() * powerUps.size());
            PowerUp powerUp = powerUps.get(randomIndex);
            // Implement logic to apply the specific effects of the power-up on the vehicle
            // For example, increase the vehicle's speed, grant invincibility, etc.
        }
    }
}

