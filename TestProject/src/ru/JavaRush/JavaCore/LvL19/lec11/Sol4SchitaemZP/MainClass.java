package ru.JavaRush.JavaCore.LvL19.lec11.Sol4SchitaemZP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * В метод main первым параметром приходит имя файла.
 * В этом файле каждая строка имеет следующий вид:
 * имя значение
 * где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.
 * Для каждого имени посчитать сумму всех его значений.
 * Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
 * Закрыть потоки.
 * <p>
 * Пример входного файла:
 * Петров 2
 * Сидоров 6
 * Иванов 1.35
 * Петров 3.1
 * <p>
 * Пример вывода:
 * Иванов 1.35
 * Петров 5.1
 * Сидоров 6.0
 */

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));

        Map<String, Double> outputData = new TreeMap<>();

        String data;
        while ((data = fileReader.readLine()) != null) {
           String[] str = data.split(" ");
           outputData.merge(str[0], Double.parseDouble(str[1]), (aDouble, aDouble2) -> aDouble+aDouble2);
        }
        fileReader.close();
        outputData.forEach((s, aDouble) -> System.out.println(s + " " + aDouble));
    }
}
