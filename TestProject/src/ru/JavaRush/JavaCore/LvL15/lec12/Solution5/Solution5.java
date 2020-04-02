package ru.JavaRush.JavaCore.LvL15.lec12.Solution5;

/**
 * 1. В классе Solution создай 4 конструктора с разными модификаторами доступа.
 * 2. В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
 * 3. Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
 * 4. Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 конструктора с различными модификаторами доступа(все кроме private).
 */

public class Solution5 {
    int a;
    String s;

    public Solution5() {
    }

    Solution5(int a) {
        this.a = a;
    }

    protected Solution5(String s) {
        this.s = s;
    }

    private Solution5(int a, String s) {
        this.a = a;
        this.s = s;
    }
}
