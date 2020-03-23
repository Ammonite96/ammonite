package ru.JavaRush.JavaCore.LvL13.lec11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String nameFile = reader.readLine();
            FileInputStream input = new FileInputStream(nameFile);


            ArrayList<Integer> num = new ArrayList<>();
            while (input.available()>0){
                int n = Integer.parseInt(String.valueOf(input));
                num.add(n);
            }

        } catch (IOException io){
            System.out.println(io.getStackTrace());
        }

    }
}

/*
/home/ammonite/IdeaProject/ammonite/TestProject/src/ru/JavaRush/JavaCore/LvL13/lec11/evenNumber.txt
 */
