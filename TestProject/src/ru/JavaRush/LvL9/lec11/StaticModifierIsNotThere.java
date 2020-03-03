package ru.JavaRush.LvL9.lec11;

import ru.JavaRush.LvL5.Solution;

/**
 * Расставь модификаторы static так, чтобы пример скомпилировался.
 */

public class StaticModifierIsNotThere {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
       StaticModifierIsNotThere e = new StaticModifierIsNotThere();
        e.A = 5;

        StaticModifierIsNotThere.D = 5;
    }

    public int getA() {
        return A;
    }
}
