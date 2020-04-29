package ru.JavaRush.JavaCore.LvL18.lec11;


import java.io.*;

/**
 * В метод main первым параметром приходит имя файла.
 * Посчитать количество букв английского алфавита, которое есть в этом файле.
 * Вывести на экран число (количество букв).
 * Закрыть потоки.
 */

public class CountEngLetters {
    public static void main(String[] args) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]));
        int alf;
        int count = 0;
        while ((alf = inputStream.read()) != -1){
            if ((alf >= 65 && alf <= 90) || (alf >= 97 && alf <= 122)){
                count++;
            }
        }
        System.out.println(count);
        inputStream.close();
    }
}

/*
ASCII коды

для A-Z 65-90
для a-z 97-122

для А-Я 192-223
для а-я 224-255
 */