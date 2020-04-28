package ru.JavaRush.JavaCore.LvL18.lec8.WDecOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используй наследование.
 * 2 При вызове метода close() должны выполняться следующая последовательность действий:
 * 2.1 Вызвать метод flush().
 * 2.2 Дописать следующий текст "JavaRush © All rights reserved.", используй метод getBytes().
 * 2.3 Закрыть поток методом close().
 */

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "test";

    FileOutputStream outputStream;

    public AmigoOutputStream(FileOutputStream outputStream) throws FileNotFoundException {
        super(fileName);
        this.outputStream = outputStream;
    }


    @Override
    public void write(int b) throws IOException {
        outputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        outputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        outputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        outputStream.flush();
        String s = "JavaRush © All rights reserved.";
        outputStream.write(s.getBytes());
        outputStream.close();
    }

    @Override
    public void flush() throws IOException {
        outputStream.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
}
