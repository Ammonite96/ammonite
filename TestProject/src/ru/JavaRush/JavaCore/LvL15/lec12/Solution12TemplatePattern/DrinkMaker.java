package ru.JavaRush.JavaCore.LvL15.lec12.Solution12TemplatePattern;

public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
