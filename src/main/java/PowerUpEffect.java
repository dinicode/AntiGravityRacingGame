public class PowerUpEffect {
    private double speedBoostPercentage;
    private boolean invincibility;
    // Add more effect attributes as needed...

    public PowerUpEffect(double speedBoostPercentage, boolean invincibility) {
        this.speedBoostPercentage = speedBoostPercentage;
        this.invincibility = invincibility;
    }

    public double getSpeedBoostPercentage() {
        return speedBoostPercentage;
    }

    public boolean isInvincibility() {
        return invincibility;
    }

    public void setSpeedBoostPercentage(double speedBoostPercentage) {
        this.speedBoostPercentage = speedBoostPercentage;
    }

    public void setInvincibility(boolean invincibility) {
        this.invincibility = invincibility;
    }
}
