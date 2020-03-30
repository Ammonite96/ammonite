package ru.JavaRush.JavaCore.LvL14.lec8.Currencies;

public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
