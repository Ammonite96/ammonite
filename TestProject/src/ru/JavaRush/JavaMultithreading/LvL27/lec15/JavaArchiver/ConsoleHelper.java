package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String consoleString = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            consoleString = reader.readLine();
            return consoleString;
        } catch (IOException io) {
            System.out.println("Попробуйте еще раз");
            consoleString = readString();
        }
        return consoleString;
    }

    public static int readInt() {
        String string = readString();
        int consoleInt = 0;
        try {
            consoleInt = Integer.parseInt(string);
            return consoleInt;
        } catch (NumberFormatException io) {
            System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            consoleInt = readInt();
        }
        return consoleInt;
    }
}
