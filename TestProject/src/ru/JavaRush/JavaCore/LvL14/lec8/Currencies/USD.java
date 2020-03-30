package ru.JavaRush.JavaCore.LvL14.lec8.Currencies;

public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
