package ru.JavaRush.JavaCore.LvL19.lec8;

import java.io.*;

/**
 * Считай с консоли имя файла.
 * В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна выводить весь текст и на консоль и в файл, имя которого ты считал.
 * Вызови готовый метод printSomething(), воспользуйся testString.
 * Верни переменной System.out первоначальный поток.
 * Закрой поток файла.
 * Пример вывода на экран:
 * it's a text for testing
 *
 * Пример тела файла:
 * it's a text for testing
 */

public class ReaderWrapperSol5 {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String resultString = outputStream.toString();
        System.setOut(consoleStream);

        System.out.println(resultString);

        char[] charStr = resultString.toCharArray();
        for (char c : charStr){
            fileOutputStream.write(c);
        }
        fileOutputStream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
