package ru.JavaRush.JavaCore.LvL19.lec8;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна выводить на консоль решенный пример.
 * Вызови готовый метод printSomething(), воспользуйтесь testString.
 * Верни переменной System.out первоначальный поток.
 * Возможные операции: + - *
 * Шаблон входных данных и вывода: a [знак] b = c
 * Отрицательных и дробных чисел, унарных операторов - нет.
 *
 * Пример вывода:
 * 3 + 6 = 9
 */

public class ReaderWrapper4 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String resultString = outputStream.toString();
        System.setOut(consoleStream);

        String[] strArray = resultString.split(" ");
        int resultInt;
        switch (strArray[1]){
            case "+":
                resultInt = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[2]);
                break;
            case "-":
                resultInt = Integer.parseInt(strArray[0]) - Integer.parseInt(strArray[2]);
                break;
            case "*":
                resultInt = Integer.parseInt(strArray[0]) * Integer.parseInt(strArray[2]);
                break;
            default:
                resultInt = -1;
                break;
        }
        System.out.print(resultString + resultInt);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 * 6 = ");
        }
    }
}
