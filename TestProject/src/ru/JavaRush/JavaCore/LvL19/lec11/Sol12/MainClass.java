package ru.JavaRush.JavaCore.LvL19.lec11.Sol12;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * В методе main подмени объект System.out написанной тобой реадер-оберткой.
 * Твоя реадер-обертка должна выводить на консоль контекстную рекламу после каждого второго println-а.
 * Вызови готовый метод printSomething(), воспользуйся testString.
 * Верни переменной System.out первоначальный поток.
 * Рекламный текст: "JavaRush - курсы Java онлайн"
 *
 * Пример вывода:
 * first
 * second
 * JavaRush - курсы Java онлайн
 * third
 * fourth
 * JavaRush - курсы Java онлайн
 * fifth
 */

public class MainClass {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String resultString = outputStream.toString();
        System.setOut(consoleStream);

        String[] arr = resultString.split("\\n");
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            String str = arr[i];
            System.out.println(str);
            count++;
            if (count == 2){
                System.out.println("JavaRush - курсы Java онлайн");
                count = 0;
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
