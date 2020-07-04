package ru.JavaRush.JavaMultithreading.LvL22.lec5.sol1;

/**
 * Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
 * На некорректные данные бросить исключение TooShortStringException.
 * Класс TooShortStringException не менять.
 */

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        int count = 0;
        if (string == null){
            throw new TooShortStringException();
        }
        if (string != null) {
            String[] splitString = string.split(" ");
            for (String s : splitString) {
                if (s.contains("\t")) {
                    count++;
                }
            }

            if (count < 2) {
                throw new TooShortStringException();
            }

            String[] splitStringResult = string.split("\t");
            return splitStringResult[1];
        }
        return "";
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJava\tRush - лучший\t сервис обучения Java.\t"));
    }
}
//"\tJava\tRush - лучший\t сервис обучения Java.\t"