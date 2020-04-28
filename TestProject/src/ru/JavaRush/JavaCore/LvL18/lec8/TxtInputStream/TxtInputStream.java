package ru.JavaRush.JavaCore.LvL18.lec8.TxtInputStream;

/**
 * Измени класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt).
 * Например, first.txt или name.1.part3.txt.
 * Если передан не txt-файл, например, file.txt.exe, то конструктор должен выбрасывать исключение UnsupportedFileNameException.
 * Подумай, что еще нужно сделать, в случае выброшенного исключения.
 */

import java.io.FileInputStream;
import java.io.IOException;

public class TxtInputStream extends FileInputStream {
    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (!(fileName.endsWith(".txt"))){
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {

    }
}
