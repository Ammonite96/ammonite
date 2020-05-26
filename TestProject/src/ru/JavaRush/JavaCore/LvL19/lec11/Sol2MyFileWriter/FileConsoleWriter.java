package ru.JavaRush.JavaCore.LvL19.lec11.Sol2MyFileWriter;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Реализовать логику FileConsoleWriter.
 * Класс FileConsoleWriter должен содержать приватное поле FileWriter fileWriter.
 * Класс FileConsoleWriter должен содержать все конструкторы, которые инициализируют fileWriter для записи.
 * Класс FileConsoleWriter должен содержать пять методов write и один метод close:
 * public void write(char[] cbuf, int off, int len) throws IOException
 * public void write(int c) throws IOException
 * public void write(String str) throws IOException
 * public void write(String str, int off, int len) throws IOException
 * public void write(char[] cbuf) throws IOException
 * public void close() throws IOException
 * При записи данных в файл, должен дублировать эти данные на консоль.
 */

public class FileConsoleWriter {
    private FileWriter fileWriter;
    private BufferedWriter consoleWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public FileConsoleWriter(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        fileWriter = new FileWriter(fd);
    }

    public FileConsoleWriter(String fileName, Charset charset) throws IOException {
        fileWriter = new FileWriter(fileName, charset);
    }

    public FileConsoleWriter(String fileName, Charset charset, boolean append) throws IOException {
        fileWriter = new FileWriter(fileName, charset, append);
    }

    public FileConsoleWriter(File file, Charset charset) throws IOException {
        fileWriter = new FileWriter(file, charset);
    }

    public FileConsoleWriter(File file, Charset charset, boolean append) throws IOException {
        fileWriter = new FileWriter(file, charset, append);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        consoleWriter.write(cbuf, off, len);
        consoleWriter.flush();
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        consoleWriter.write(cbuf);
        consoleWriter.flush();
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        consoleWriter.write(c);
        consoleWriter.flush();
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        consoleWriter.write(str);
        consoleWriter.flush();
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        consoleWriter.write(str, off, len);
        consoleWriter.flush();
    }

    public void close() throws IOException {
        fileWriter.close();
        consoleWriter.close();
    }

    public static void main(String[] args) {

    }
}
