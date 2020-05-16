package ru.JavaRush.JavaCore.LvL19.lec5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Считать с консоли 2 имени файла.
 * Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).
 * Пример первого файла:
 * text in file
 * Вывод во втором файле:
 * eti ie
 * Закрыть потоки ввода-вывод
 */

public class EvenChar {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFileInput = reader.readLine();
        String nameFileOutput = reader.readLine();
        reader.close();

        ArrayList<Integer> listInput = new ArrayList<>();

        FileReader fileReader = new FileReader(nameFileInput);
        FileWriter fileWriter = new FileWriter(nameFileOutput);

        int count = 0;
        while (fileReader.ready()) {
            int data = fileReader.read();
            count++;
            if (count % 2 == 0)
                listInput.add(data);
        }

        for (Integer i : listInput){
            fileWriter.write(i);
        }

        fileReader.close();
        fileWriter.close();
    }

}
