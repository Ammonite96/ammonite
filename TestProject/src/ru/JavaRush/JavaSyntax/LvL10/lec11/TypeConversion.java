package ru.JavaRush.JavaSyntax.LvL10.lec11;

/**
 * Добавить одну операцию по преобразованию типа, чтобы получался ответ: d = 2.941
 *
 * Пример вывода:
 * 2.9411764705882355
 */

public class TypeConversion {
    public static void main(String[] args) {
        int a = 50;
        int b = 17;
        double d = (double) a / b;
        System.out.println(d);
    }
}
