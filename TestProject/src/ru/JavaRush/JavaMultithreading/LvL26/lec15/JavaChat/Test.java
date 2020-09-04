package ru.JavaRush.JavaMultithreading.LvL26.lec15.JavaChat;

import ru.JavaRush.JavaMultithreading.LvL26.lec15.JavaChat.client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String consoleString = null;
        try {
            consoleString = reader.readLine();
            return consoleString;
        } catch (IOException io) {
            System.out.println("Попробуйте еще раз");
            consoleString = readString();
        }
        return consoleString;
    }

    public static int readInt() {

        int consoleInt = 0;
        try {
            String string = readString();
            consoleInt = Integer.parseInt(string);
            return consoleInt;
        } catch (NumberFormatException io) {
            System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            consoleInt = readInt();
        }
        return consoleInt;
    }

    public static void main(String[] args) {
        System.out.println(readInt());
    }

}
