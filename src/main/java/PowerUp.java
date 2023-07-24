public class PowerUp {
    private String name;
    private int durationInSeconds;
    private PowerUpEffect effect;

    public PowerUp(String name, int durationInSeconds, PowerUpEffect effect) {
        this.name = name;
        this.durationInSeconds = durationInSeconds;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public PowerUpEffect getEffect() {
        return effect;
    }

    PowerUp powerUp1 = new PowerUp("Turbo Boost", 5, new PowerUpEffect(0.2, false));
    PowerUp powerUp2 = new PowerUp("Invincibility", 10, new PowerUpEffect(0, true));}

