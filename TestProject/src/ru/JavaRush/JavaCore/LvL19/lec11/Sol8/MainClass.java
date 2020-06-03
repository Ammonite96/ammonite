package ru.JavaRush.JavaCore.LvL19.lec11.Sol8;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В метод main первым параметром приходит имя файла1, вторым - файла2.
 * Файл1 содержит строки со словами, разделенными пробелом.
 * Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
 * Закрыть потоки.
 */

public class MainClass {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]))) {

            String fileData;
            while ((fileData = fileReader.readLine()) != null) {
                Pattern pattern = Pattern.compile("\\w*\\D\\d\\S*\\s*");
                Matcher matcher = pattern.matcher(fileData);
                while (matcher.find())
                    fileWriter.write(matcher.group());
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}

// \w*\D\d\S*