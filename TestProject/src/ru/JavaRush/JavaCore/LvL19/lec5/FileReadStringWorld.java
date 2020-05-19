package ru.JavaRush.JavaCore.LvL19.lec5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Считать с консоли имя файла.
 * Файл содержит слова, разделенные знаками препинания.
 * Вывести в консоль количество слов "world", которые встречаются в файле.
 * Закрыть потоки.
 */

public class FileReadStringWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(nameFile);
        Scanner scanner = new Scanner(fileReader);

        int count = 0;
        while (scanner.hasNext()) {
            String[] str = scanner.nextLine().split("[^A-Za-zА-Яа-я]+");
            for (int i = 0; i < str.length; i++){
                String string = str[i];
                if (string.equals("world"))
                    count++;
            }
        }
        fileReader.close();
        scanner.close();
        System.out.println(count);
    }
}
/*
.of(s.split("[^A-Za-zА-Яа-я]+"))
    .map(String::toLowerCase)
    .distinct().sorted()
    .forEach(System.out::println);
 */