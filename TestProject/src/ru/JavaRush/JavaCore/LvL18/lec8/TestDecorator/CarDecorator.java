package ru.JavaRush.JavaCore.LvL18.lec8.TestDecorator;

public class CarDecorator implements CarMove {
    CarMove carMove;

    public CarDecorator(CarMove carMove) {
        this.carMove = carMove;
    }

    @Override
    public String move() {
        return carMove.move();
    }
}
