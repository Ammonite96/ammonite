package Test;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMaxSpeed(300);
        car.setModel("Camry");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " " + "Model: " + car.getModel());
        System.out.println(car.driveForward());

        Toyota toyota = new Toyota();
        toyota.setMaxSpeed(200);
        toyota.setModel("Corolla");
        System.out.println("Max Speed: " +toyota.getMaxSpeed() + " " + "Model: " + toyota.getModel() + " " + toyota.getBody());
        System.out.println(toyota.driveForward());

        Car car1 = new Toyota();
        System.out.println(car1.getModel());
    }
}
