package ru.JavaRush.JavaCore.LvL18.lec8.TestDecorator;

public class Car implements CarMove {
    @Override
    public String move() {
        return "машина передвигается ";
    }
}
