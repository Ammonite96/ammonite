package ru.JavaRush.JavaCore.LvL18.lec11;

import java.io.*;
import java.util.Locale;

/**
 * В метод main первым параметром приходит имя файла.
 * Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
 * 1. Посчитать количество всех символов.
 * 2. Посчитать количество пробелов.
 * 3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
 * 4. Закрыть потоки.
 */

public class CountSpaceChar {
    public static void main(String[] args) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]));
        int charNumber;
        int count = 0;
        int countSpace = 0;
        while ((charNumber = inputStream.read()) != -1){
            count++;
            if (charNumber == 32)
                countSpace++;
        }
        inputStream.close();
        System.out.println(count);
        System.out.println(countSpace);
        double ratio = (double) countSpace/count * 100;
        System.out.println(String.format("%.2f", ratio));
    }
}

/*
ASCII коды

для A-Z 65-90
для a-z 97-122

для А-Я 192-223
для а-я 224-255

для Space 32
 */
