package ru.JavaRush.lvl8.lec11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
 * Новая задача: Программа должна работать не с номерами домов, а с городами:
 *
 * Пример ввода:
 * Москва
 * Ивановы
 * Киев
 * Петровы
 * Лондон
 * Абрамовичи
 *
 * Лондон
 *
 * Пример вывода:
 * Абрамовичи
 */

public class ModernizationPO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Добавьте значения.");
        Map<String, String> familyCity = new HashMap<>();
        while (true){
            String keyCity = reader.readLine();
            if (keyCity.isEmpty())
                break;
            String valueFamily = reader.readLine();
            if (valueFamily.isEmpty())
                break;
            familyCity.put(keyCity, valueFamily);

        }
        System.out.println("Введите город:");
        String city = reader.readLine();
        for (Map.Entry<String, String> pair : familyCity.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            if (city.equals(key))
                System.out.println(value);
        }
    }
}

/*

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }

 */
