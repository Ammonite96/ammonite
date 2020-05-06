package ru.JavaRush.JavaCore.LvL18.lec11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * Программа запускается с одним параметром - именем файла, который содержит английский текст.
 * Посчитать частоту встречания каждого символа.
 * Отсортировать результат по возрастанию кода ASCII (почитать в инете).
 * Пример:
 * ','=44, 's'=115, 't'=116.
 *
 * Вывести на консоль отсортированный результат:
 * [символ1] частота1
 * [символ2] частота2
 * Закрыть потоки.
 *
 * Пример вывода:
 * , 19
 * - 7
 * f 361
 */

public class OccurrenceCharacters {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);

        Map<Character, Integer> result = new TreeMap<>();
        ArrayList<Integer> characterList = new ArrayList<>();
        int count = 0;
        int charN;
        while ((charN = inputStream.read()) != -1) {
            characterList.add(charN);
        }
        inputStream.close();
        //Collections.sort(characterList);

        for (int i = 0; i < characterList.size(); i++) {
          for (int j = 0; j < characterList.size(); j++){
              if (characterList.get(i) == characterList.get(j))
                  count++;
          }
          int ch = characterList.get(i);
          result.put((char)ch, count);
          count = 0;
        }
        result.forEach((character, integer) -> System.out.println(character + " " + integer));
    }
}

