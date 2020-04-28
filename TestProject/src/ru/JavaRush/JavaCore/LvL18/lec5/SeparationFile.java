package ru.JavaRush.JavaCore.LvL18.lec5;

import java.io.*;

/**
 * Считать с консоли три имени файла: файл1, файл2, файл3.
 * Разделить файл1 по следующему критерию:
 * Первую половину байт записать в файл2, вторую половину байт записать в файл3.
 * Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
 * Закрыть потоки.
 */

public class SeparationFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
        FileOutputStream outputStream1 = new FileOutputStream(file3);
        byte[] buffer = new byte[inputStream.available()];
        while (inputStream.available()>0){
            int data = inputStream.read(buffer);
            if (!(buffer.length % 2 == 0)){
                outputStream.write(buffer, 0 , (data/2)+1);
                outputStream1.write(buffer, (data/2)+1, data/2);
            }else {
                outputStream.write(buffer, 0, data / 2);
                outputStream1.write(buffer, data/2, data/2);
            }
        }

        reader.close();
        inputStream.close();
        outputStream.close();
        outputStream1.close();
    }
}
