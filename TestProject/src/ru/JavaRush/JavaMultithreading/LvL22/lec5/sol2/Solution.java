package ru.JavaRush.JavaMultithreading.LvL22.lec5.sol2;

/**
 * Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
 * которое следует после 4-го пробела.
 * <p>
 * Пример:
 * "JavaRush - лучший сервис обучения Java."
 * <p>
 * Результат:
 * "- лучший сервис обучения"
 * <p>
 * Пример:
 * "Амиго и Диего лучшие друзья!"
 * <p>
 * Результат:
 * "и Диего лучшие друзья!"
 * <p>
 * На некорректные данные бросить исключение TooShortStringException (сделать исключением).
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис"));
    }

    public static String getPartOfString(String string) {
        if (string == null){
            throw new TooShortStringException();
        }
        if (string != null) {
            String[] splitString = string.split(" ");
            if (splitString.length <= 4) {
                throw new TooShortStringException();
            }
            String result = splitString[1] + " " + splitString[2] + " " + splitString[3] + " " + splitString[4];
            return result;
        }
        return "";
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
