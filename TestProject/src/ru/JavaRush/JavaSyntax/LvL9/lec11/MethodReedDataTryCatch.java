package ru.JavaRush.LvL9.lec11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Написать программу, которая будет вводить числа с клавиатуры.
 * Код по чтению чисел с клавиатуры должен быть в методе readData.
 * Код внутри readData обернуть в try..catch.
 * Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
 * Числа выводить с новой строки сохраняя порядок ввода.
 */

public class MethodReedDataTryCatch {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            for (; true; ) {
                arrayList.add(Integer.parseInt(reader.readLine()));
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        } catch (NumberFormatException num){
            for (Integer in : arrayList)
                System.out.println(in);
        }
    }
}
