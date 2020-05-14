package ru.JavaRush.JavaCore.LvL18.lec11;

import javax.crypto.*;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

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
    KeyGenerator keygen;
    {
        try {
            keygen = KeyGenerator.getInstance("AES");
            keygen.init(256);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    Key key = keygen.generateKey();
    Cipher cipher;

    {
        try {
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        CryptographyFile cryptographyFile = new CryptographyFile();
        cryptographyFile.Encrypt("test", "test1");
        cryptographyFile.Decrypt("test1", "test2");
    }

    private void Encrypt(String nameFile, String nameOutFile) throws Exception {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(nameFile));
        byte[] fileByte = new byte[inputStream.available()];
        while (inputStream.available() > 0){
            int b = inputStream.read(fileByte);
        }
        byte[] encrypt = cipher.doFinal(fileByte);
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(nameOutFile));
        outputStream.write(encrypt, 0, encrypt.length);
        inputStream.close();
        outputStream.close();

    }

    private void Decrypt(String nameFile, String nameOutFile) throws Exception {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(nameFile));
        byte[] isByte = new byte[inputStream.available()];
        while (inputStream.available() > 0){
            int b = inputStream.read(isByte);
        }
        byte[] decrypt = cipher.doFinal(isByte);
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(nameOutFile));
        outputStream.write(decrypt, 0, decrypt.length);

        inputStream.close();
        outputStream.close();
    }
}
