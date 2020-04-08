package ru.JavaRush.JavaCore.LvL16.lec13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. В классе Solution создать public static класс нити Read3Strings унаследовавшись от Thread.
 * 2. В методе run реализовать чтение с консоли трех строк.
 * 3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
 * 4. В методе main вывести результат для каждой нити.
 * 5. Используй join.
 * Пример:
 *
 * Входные данные:
 * a
 * b
 * c
 * d
 * e
 * f
 *
 * Выходные данные:
 * a b c
 * d e f
 */

public class Thread8MainClass {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread{
     volatile ArrayList<String> strings = new ArrayList<>();
        @Override
        public void run() {
            int count = 0;
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String str = reader.readLine();
                String str1 = reader.readLine();
                String str2 = reader.readLine();
                strings.add(str + " " + str1 + " " + str2 + " ");
            } catch (IOException io){}
        }

        public void printResult(){
            for (int i = 0; i < strings.size();i++){
                System.out.print(strings.get(i));
                System.out.println();
            }
        }
    }
}

/*
for (int i = 0; i < strings.size(); i++){
                System.out.print(strings.get(i)+" ");
            }
 */