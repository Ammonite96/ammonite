package ru.JavaRush.JavaCore.LvL18.lec11;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.io.*;
import java.security.*;


public class TestCrypto {
    public static void main(String[] args) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("test"));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("test3"));
        byte[] isByte = new byte[inputStream.available()];
        while (inputStream.available()>0){
            int b= inputStream.read(isByte);
        }
        outputStream.write(isByte, 0 , isByte.length);
        inputStream.close();
        outputStream.close();
    }
}


