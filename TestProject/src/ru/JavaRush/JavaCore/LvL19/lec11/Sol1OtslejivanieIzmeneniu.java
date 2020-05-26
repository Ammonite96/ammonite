package ru.JavaRush.JavaCore.LvL19.lec11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Считать с консоли 2 имени файла - file1, file2.
 * Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
 * Нужно создать объединенную версию строк, записать их в список lines.
 * Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME.
 * Пустые строки даны в примере для наглядности.
 * В оригинальном и редактируемом файлах пустых строк нет!
 * Пример 1:
 * оригинальный    редактированный    общий
 * file1:          file2:             результат:(lines)
 * <p>
 * строка1         строка1            SAME строка1
 * строка2                            REMOVED строка2
 * строка3         строка3            SAME строка3
 * строка4                            REMOVED строка4
 * строка5         строка5            SAME строка5
 * строка0            ADDED строка0
 * строка1         строка1            SAME строка1
 * строка2                            REMOVED строка2
 * строка3         строка3            SAME строка3
 * строка4            ADDED строка4
 * строка5         строка5            SAME строка5
 * строка0                            REMOVED строка0
 * <p>
 * Пример 2:
 * оригинальный    редактированный    общий
 * file1:          file2:             результат:(lines)
 * <p>
 * строка1         строка1            SAME строка1
 * строка0            ADDED строка0
 * <p>
 * Пустые строки в примере означают, что этой строки нет в определенном файле.
 */

public class Sol1OtslejivanieIzmeneniu {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();


        BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2));

        ArrayList<String> dataFile1 = new ArrayList<>();
        ArrayList<String> dataFile2 = new ArrayList<>();

        String str1;
        String str2;
        while ((str1 = fileReader1.readLine()) != null)
            dataFile1.add(str1);
        fileReader1.close();

        while ((str2 = fileReader2.readLine()) != null)
            dataFile2.add(str2);
        fileReader2.close();

        while (dataFile1.size() > 0 && dataFile2.size() > 0) {

            if (dataFile1.get(0).equals(dataFile2.get(0))) {
                lines.add(new LineItem(Type.SAME, dataFile1.get(0)));
                dataFile1.remove(0);
                dataFile2.remove(0);
            } else if (dataFile1.get(0).equals(dataFile2.get(1))) {
                lines.add(new LineItem(Type.ADDED, dataFile2.get(0)));
                dataFile2.remove(0);
            } else if (dataFile2.get(0).equals(dataFile1.get(1))) {
                lines.add(new LineItem(Type.REMOVED, dataFile1.get(0)));
                dataFile1.remove(0);
            }

        }

        if (dataFile1.size() == 0) {
            for (int i = 0; i < dataFile2.size(); i++)
                lines.add(new LineItem(Type.ADDED, dataFile2.get(i)));
        }

        if (dataFile2.size() == 0) {
            for (int i = 0; i < dataFile1.size(); i++)
                lines.add(new LineItem(Type.REMOVED, dataFile1.get(i)));
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
