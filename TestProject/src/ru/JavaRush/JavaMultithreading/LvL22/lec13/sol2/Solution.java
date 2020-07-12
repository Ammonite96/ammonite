package ru.JavaRush.JavaMultithreading.LvL22.lec13.sol2;

import java.io.*;

/**
 * В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
 * В метод main вторым параметром приходит имя файла,
 * в который необходимо записать содержимое первого файла в кодировке UTF-8.
 */

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream(args[0]);
             FileOutputStream outputStream = new FileOutputStream(args[1])) {

            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);

            outputStream.write(new String(buffer, "Windows-1251").getBytes("UTF-8"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
