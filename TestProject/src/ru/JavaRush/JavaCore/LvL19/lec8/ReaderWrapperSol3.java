package ru.JavaRush.JavaCore.LvL19.lec8;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна выводить только цифры.
 * Вызови готовый метод printSomething(), воспользуйтесь testString.
 * Верни переменной System.out первоначальный поток.
 * Выведи модифицированную строку в консоль.
 * Пример вывода:
 * 12345678
 */

public class ReaderWrapperSol3 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(result);
        while (matcher.find()){
            String str = matcher.group();
            System.out.print(str);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
