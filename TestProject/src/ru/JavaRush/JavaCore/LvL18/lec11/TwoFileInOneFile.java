package ru.JavaRush.JavaCore.LvL18.lec11;

import javax.swing.*;
import java.io.*;

/**
 * Считать с консоли 3 имени файла.
 * Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
 * Закрыть потоки.
 */

public class TwoFileInOneFile {
    private void systemIn () throws FileNotFoundException {
        String[] nameFile = {"test", "test1", "test2"};
        for (String s : nameFile){
            String string = s;
            byte[] bytes = string.getBytes();
            InputStream inputStream = new ByteArrayInputStream(bytes);
            System.setIn(inputStream);
        }
    }

    public static void main(String[] args) throws IOException {
        TwoFileInOneFile twoFileInOneFile = new TwoFileInOneFile();
        twoFileInOneFile.systemIn();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        System.out.println(file);
        System.out.println(file1);

    }
}
