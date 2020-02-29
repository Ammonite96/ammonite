package ru.JavaRush.lvl8.lec11;

/**
 * Переставь один модификатор static, чтобы пример скомпилировался.
 */

public class ModStat {
    public static int A = 5;  //не было static
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public  int getValue() {    //был static
        return D;
    }

    public int getValue2() {
        return C;
    }
}
