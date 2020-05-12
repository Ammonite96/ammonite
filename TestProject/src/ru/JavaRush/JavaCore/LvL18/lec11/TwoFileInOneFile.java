package ru.JavaRush.JavaCore.LvL18.lec11;

import java.io.*;

/**
 * Считать с консоли 3 имени файла.
 * Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
 * Закрыть потоки.
 */

public class TwoFileInOneFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true));
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file1));
        BufferedInputStream inputStream1 = new BufferedInputStream(new FileInputStream(file2));

        int charN;
        while ((charN = inputStream.read()) != -1){
            outputStream.write(charN);
        }
        while ((charN = inputStream1.read()) != -1){
            outputStream.write(charN);
        }
        outputStream.close();
        inputStream.close();
        inputStream1.close();
    }
}
