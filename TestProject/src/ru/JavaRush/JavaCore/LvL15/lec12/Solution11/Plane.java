package ru.JavaRush.JavaCore.LvL15.lec12.Solution11;

public class Plane implements CanFly {
    @Override
    public void fly() {

    }

    private int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
