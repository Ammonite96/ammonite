package ru.JavaRush.JavaCore.LvL20.lec10.Sol7;

/**
 * Сериализация/десериализация Solution не работает.
 * Исправь ошибки не меняя сигнатуры методов и класса.
 * Метод main не участвует в тестировании.
 *
 * Написать код проверки самостоятельно в методе main:
 * 1) создать экземпляр класса Solution
 * 2) записать в него данные - writeObject
 * 3) сериализовать класс Solution - writeObject(ObjectOutputStream out)
 * 4) десериализовать, получаем новый объект
 * 5) записать в новый объект данные - writeObject
 * 6) проверить, что в файле есть данные из п.2 и п.5
 */

import java.io.*;

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) {

    }
}
