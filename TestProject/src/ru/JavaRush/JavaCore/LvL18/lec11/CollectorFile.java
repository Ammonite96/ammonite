package ru.JavaRush.JavaCore.LvL18.lec11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * Собираем файл из кусочков.
 * Считывать с консоли имена файлов.
 * Каждый файл имеет имя: [someName].partN.
 * Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
 * <p>
 * Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
 * В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].
 * <p>
 * Например, Lion.avi.
 * <p>
 * В него переписать все байты из файлов-частей используя буфер.
 * Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
 * Закрыть потоки.
 */

public class CollectorFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> fileSet = new TreeSet<>();
        String str;
        while (!(str = reader.readLine()).equals("end")) {
            fileSet.add(str);
        }
        reader.close();
        String firstFileName = fileSet.first();
        FileOutputStream outputStream = new FileOutputStream(firstFileName.substring(0, firstFileName.lastIndexOf('.')), true);

        for (String fileName : fileSet) {
            FileInputStream inputStream = new FileInputStream(fileName);
            if (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                inputStream.read(buffer);
                outputStream.write(buffer);
            }
            inputStream.close();
        }
        outputStream.close();
    }
}
