package ru.JavaRush.JavaCore.LvL18.lec8.TestDecorator;

public class MainClass{
    public static void main(String[] args) {
        CarMove carMove = new ToyotaCar (new FerrariCar(new Car()));
        System.out.println(carMove.move());
    }
}
