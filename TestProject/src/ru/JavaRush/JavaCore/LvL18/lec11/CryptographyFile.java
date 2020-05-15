package ru.JavaRush.JavaCore.LvL18.lec11;

import java.io.*;


/**
 * Придумать механизм шифровки/дешифровки.
 * Программа запускается с одним из следующих наборов параметров:
 * -e fileName fileOutputName
 * -d fileName fileOutputName
 * <p>
 * где:
 * fileName - имя файла, который необходимо зашифровать/расшифровать.
 * fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
 * -e - ключ указывает, что необходимо зашифровать данные.
 * -d - ключ указывает, что необходимо расшифровать данные.
 */

public class CryptographyFile {

    private static byte key = 10;

    public static void main(String[] args) throws IOException {
        if(args.length < 3) return;

        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);

        while (inputStream.available() > 0){
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
           // System.out.println(Arrays.toString(crypt(bytes)));
            outputStream.write(crypt(bytes));
        }

        inputStream.close();
        outputStream.close();

    }

    private static byte[] crypt(byte[] data){
        byte[] res = new byte[data.length];

        for(int i = 0; i < data.length; i++){
            res[i] = (byte)(data[i] ^ key);
        }

        return res;
    }
}
