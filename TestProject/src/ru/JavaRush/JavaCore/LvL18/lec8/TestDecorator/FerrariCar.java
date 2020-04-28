package ru.JavaRush.JavaCore.LvL18.lec8.TestDecorator;

public class FerrariCar extends CarDecorator {
    public FerrariCar(CarMove carMove) {
        super(carMove);
    }

    public String ferrariMove (){
        return "Ferrari летит. ";
    }

    @Override
    public String move() {
        return super.move() + ferrariMove();
    }
}
