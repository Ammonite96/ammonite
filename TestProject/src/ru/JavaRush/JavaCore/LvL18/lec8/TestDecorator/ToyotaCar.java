package ru.JavaRush.JavaCore.LvL18.lec8.TestDecorator;

public class ToyotaCar extends CarDecorator {
    public ToyotaCar(CarMove carMove) {
        super(carMove);
    }

    public String toyotaMove(){
        return "Toyota прёт ";
    }

    @Override
    public String move() {
        return super.move() + toyotaMove();
    }
}
