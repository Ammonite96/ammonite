package Test;

public class Car {
    private int maxSpeed;
    private String model;


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String driveForward() {
        return "Еду в перёд";
    }
}
