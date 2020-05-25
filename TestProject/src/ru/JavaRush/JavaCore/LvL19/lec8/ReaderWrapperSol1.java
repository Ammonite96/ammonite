package ru.JavaRush.JavaCore.LvL19.lec8;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
 * Вызови готовый метод printSomething(), воспользуйся testString.
 * Верни переменной System.out первоначальный поток.
 * Выведи модифицированную строку в консоль.
 */

public class ReaderWrapperSol1 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);
        System.out.println(result.toUpperCase());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
