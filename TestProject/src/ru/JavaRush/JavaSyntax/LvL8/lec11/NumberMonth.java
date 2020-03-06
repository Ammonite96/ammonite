package ru.JavaRush.LvL8.lec11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
 * Используйте коллекции.
 */

public class NumberMonth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameMonth = reader.readLine();

        Map<Integer, String> mapMonth = new HashMap<>();
        String[] value = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < 12; i++){
            mapMonth.put((i+1), value[i]);
        }
        for (Map.Entry<Integer, String> pair : mapMonth.entrySet()){
            int key = pair.getKey();
            String valueMonth = pair.getValue();
            if (nameMonth.equals(valueMonth))
                System.out.println(nameMonth + " is the " + key + " month");
        }
    }
}
