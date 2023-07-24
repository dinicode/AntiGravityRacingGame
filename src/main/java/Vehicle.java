import java.util.Random;

class Vehicle {
    private String name;
    private int speed;
    private int acceleration;
    private int handling;
    private int lapsCompleted;

    public Vehicle(String name, int speed, int acceleration, int handling) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
        this.handling = handling;
        this.lapsCompleted = 0;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getHandling() {
        return handling;
    }

    public int getLapsCompleted() {
        return lapsCompleted;
    }

    public void completeLap() {
        lapsCompleted++;
    }

    public int getDistanceCovered(int time) {
        Random random = new Random();
        int randomFactor = random.nextInt(11) - 5; // Random number between -5 and 5
        return (speed + randomFactor) * time + (acceleration + randomFactor) * time * time / 2;
    }
}


