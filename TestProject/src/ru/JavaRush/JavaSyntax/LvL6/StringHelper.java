package ru.JavaRush.LvL6;

/**
 * Сделать класс StringHelper, у которого будут 2 статических метода:
 * String multiply(String s, int count) - возвращает строку повторенную count раз.
 * String multiply(String s) - возвращает строку повторенную 5 раз.
 *
 * Пример:
 * Амиго -> АмигоАмигоАмигоАмигоАмиго
 */

public class StringHelper {

    public static String multiply(String s) {
        String result = s;
        for (int i = 1; i < 5; i++)
            result +=s;
            System.out.print(result);
        return result;
    }

    public static String multiply(String s, int count) {
        String result = s;
        for (int c = 1; c < count; c++)
            result +=s;
            System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        StringHelper stringHelper = new StringHelper();
        StringHelper.multiply("Ротор");
        StringHelper.multiply("Статтер", 6);
    }
}
