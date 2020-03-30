package ru.JavaRush.JavaCore.LvL14.lec8.Currencies;

public class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
