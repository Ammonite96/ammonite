package ru.JavaRush.JavaSyntax.LvL10.lec11;

/**
 * Добавить одну операцию по преобразованию типа, чтобы получался ответ: d = 5.5
 */

public class TypeConversion1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a +  b / c / (double) e;
        System.out.println(d);
    }
}
