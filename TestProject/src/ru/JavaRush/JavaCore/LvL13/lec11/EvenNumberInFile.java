package ru.JavaRush.JavaCore.LvL13.lec11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 1. Ввести имя файла с консоли.
 * 2. Прочитать из него набор чисел.
 * 3. Вывести на консоль только четные, отсортированные по возрастанию.
 * Пример ввода:
 * 5
 * 8
 * -2
 * 11
 * 3
 * -5
 * 2
 * 10
 *
 * Пример вывода:
 * -2
 * 2
 * 8
 * 10
 */

public class EvenNumberInFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String nameFile = reader.readLine();
            BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(nameFile)));
            ArrayList<Integer> numbers = new ArrayList<>();
            String str = null;
            while (true) {
                str = r.readLine();
                if (str == null)
                    break;
                int num = Integer.parseInt(str);
                numbers.add(num);
            }
            r.close();
            Collections.sort(numbers);
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0)
                    System.out.println(numbers.get(i));
            }

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}

/*
/home/ammonite/IdeaProject/ammonite/TestProject/src/ru/JavaRush/JavaCore/LvL13/lec11/evenNumber.txt
 */
