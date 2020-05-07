package ru.JavaRush.JavaCore.LvL18.lec11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Читайте с консоли имена файлов, пока не будет введено слово "exit".
 * Передайте имя файла в нить ReadThread.
 * Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
 * где параметр String - это имя файла, параметр Integer - это искомый байт.
 * Закрыть потоки.
 */

public class FindObject {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile;
        while (!(nameFile = reader.readLine()).equals("exit")){
            new ReadThread(nameFile);
        }
        resultMap.forEach((s, integer) -> System.out.println(s + " " + integer));
    }

    public static class ReadThread extends Thread {
        ArrayList<Integer> charList = new ArrayList<>();
        Map<Integer, Integer> charMap = new HashMap<>();
        String file;
        int count = 0;

        public ReadThread(String fileName) {
            //implement constructor body
            file = fileName;
            start();
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try {
                FileInputStream inputStream = new FileInputStream(file);
                int charN;
                while ((charN = inputStream.read()) != -1) {
                    charList.add(charN);
                }
                inputStream.close();

                for (int i = 0; i < charList.size(); i++) {
                    for (int j = 0; j < charList.size(); j++){
                        if (charList.get(i) == charList.get(j))
                            count++;
                    }
                    int ch = charList.get(i);
                    charMap.put(ch, count);
                    count = 0;
                }
            }catch (IOException io) {io.getStackTrace();}

            int maxKey = charMap.entrySet()
                    .stream()
                    .max((o1, o2) -> o1.getValue().compareTo(o2.getValue())).get().getKey();
            resultMap.put(file, maxKey);
        }
    }
}
