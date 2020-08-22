package ru.JavaRush.JavaMultithreading.LvL25.lec16.Refactoring.car;

public class Truck extends Car {
    private final int MAX_TRUCK_SPEED = 80;

    public Truck(int numberOfPassengers) {
        super(TRUCK, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_TRUCK_SPEED;
    }
}
