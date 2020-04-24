package ru.JavaRush.JavaCore.LvL17.lec10.Solution3Restaurant;

public class Table {
    private static byte tableNumber;
    private byte number = ++tableNumber;

    public Order getOrder() {
        return new Order(number);
    }
}
