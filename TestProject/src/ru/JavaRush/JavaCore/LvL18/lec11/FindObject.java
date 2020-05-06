package ru.JavaRush.JavaCore.LvL18.lec11;

import java.util.HashMap;
import java.util.Map;

/**
 * Читайте с консоли имена файлов, пока не будет введено слово "exit".
 * Передайте имя файла в нить ReadThread.
 * Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
 * где параметр String - это имя файла, параметр Integer - это искомый байт.
 * Закрыть потоки.
 */

public class FindObject {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {

    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) {
            //implement constructor body
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
