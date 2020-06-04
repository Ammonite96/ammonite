package ru.JavaRush.JavaCore.LvL19.lec11.Sol11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Считать с консоли имя файла. Считать содержимое файла.
 * 2. Для каждой строки в файле:
 * 2.1. переставить все символы в обратном порядке.
 * 2.2. вывести на экран.
 * 3. Закрыть потоки.
 * Пример тела входного файла:
 * я - программист.
 * Амиго
 * <p>
 * Пример результата:
 * .тсиммаргорп - я
 * огимА
 */

public class MainClass {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {

            String fileData;
            while ((fileData = fileReader.readLine()) != null){
                StringBuilder builder = new StringBuilder(fileData);
                builder.reverse();
                System.out.println(builder.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
