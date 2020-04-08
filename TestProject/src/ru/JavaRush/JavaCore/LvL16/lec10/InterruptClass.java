package ru.JavaRush.JavaCore.LvL16.lec10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Напиши реализацию метода run в нити Stopwatch (секундомер).
 * 2. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
 * 3. Выведи количество секунд в консоль.
 */

public class InterruptClass {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                //add your code here - добавьте код тут
                Thread current = Thread.currentThread();
                while (!current.isInterrupted()){
                    seconds++;
                    Thread.sleep(1000);
                }
                System.out.println(seconds);
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
