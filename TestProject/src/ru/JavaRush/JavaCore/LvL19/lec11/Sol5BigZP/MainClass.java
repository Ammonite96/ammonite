package ru.JavaRush.JavaCore.LvL19.lec11.Sol5BigZP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * В метод main первым параметром приходит имя файла.
 * В этом файле каждая строка имеет следующий вид:
 * имя значение
 * где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.
 * Для каждого имени посчитать сумму всех его значений.
 * Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
 * Имена разделять пробелом либо выводить с новой строки.
 * Закрыть потоки.
 * <p>
 * Пример входного файла:
 * Петров 0.501
 * Иванов 1.35
 * Петров 0.85
 * <p>
 * Пример вывода:
 * Петров
 */

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));

        Map<String, Double> outputData = new TreeMap<>();

        String data;
        while ((data = fileReader.readLine()) != null) {
            String[] str = data.split(" ");
            outputData.merge(str[0], Double.parseDouble(str[1]), (aDouble, aDouble2) -> aDouble + aDouble2);
        }
        fileReader.close();

        Double maxValueInMap = (Collections.max(outputData.values()));
        for (Map.Entry<String, Double> entry : outputData.entrySet()) {
            if (entry.getValue().equals(maxValueInMap)) {
                System.out.println(entry.getKey());
            }
        }
    }
}

/*
Double maxValueInMap = (Collections.max(outputData.values()));  // This will return max value in the Hashmap
        for (Map.Entry<String, Double> entry : outputData.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }
 */