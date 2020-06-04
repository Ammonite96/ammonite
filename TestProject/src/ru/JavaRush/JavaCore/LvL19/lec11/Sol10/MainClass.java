package ru.JavaRush.JavaCore.LvL19.lec11.Sol10;

import java.io.*;

/**
 * В метод main первым параметром приходит имя файла1, вторым - файла2.
 * Файл1 содержит слова, разделенные пробелом.
 * Записать через запятую в Файл2 слова, длина которых строго больше 6.
 * В конце файла2 запятой не должно быть.
 * Закрыть потоки.
 * Пример выходных данных в файл2:
 * длинное,короткое,аббревиатура
 */

public class MainClass {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]))){

            StringBuilder builder = new StringBuilder();
            String fileData;
            while ((fileData = fileReader.readLine()) != null){
                String[] arrayFileData = fileData.split(" ");
                for (int i = 0; i < arrayFileData.length; i++){
                    String tempStr = arrayFileData[i];
                    if (tempStr.length() > 6){
                        builder.append(tempStr.trim()).append(",");
                    }
                }
            }
            String write = builder.deleteCharAt(builder.length()-1).toString();
            fileWriter.write(write);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
