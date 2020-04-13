package ru.JavaRush.JavaCore.LvL16.lec13.Thread10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



/**
 * 1. Создай 5 различных своих нитей c отличным от Thread типом:
 * 1.1. Нить 1 должна бесконечно выполняться;
 * 1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
 * 1.3. Нить 3 должна каждые полсекунды выводить "Ура";
 * 1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
 * 1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
 * 2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
 * 3. Нити не должны стартовать автоматически.
 * Подсказка:
 * Нить 4 можно проверить методом isAlive()
 */

public class Thread10MainClass {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThread());
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
    }


    public static void main(String[] args) {
        for (int i = 0; i < threads.size(); i++){
            threads.get(i).start();
        }
    }

    public static class MyThread extends Thread{

        @Override
        public void run() {
            while (!isInterrupted()){
                try {
                    Thread.sleep(1000);
                    System.out.println("This is one My Thread");
                }catch (InterruptedException ie){ie.getMessage();}
            }
        }
    }

    public static class MyThread1 extends Thread{

        @Override
        public void run() {
           interrupt();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MyThread2 extends Thread{

        @Override
        public void run() {
            try {
                while (!(isInterrupted())) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            }catch (InterruptedException in){
                in.getMessage();
            }
        }
    }

    public static class MyThread3 extends Thread implements Message{
        boolean isClose = true;
        @Override
        public void run() {
            while (isClose){

            }
        }

        @Override
        public void showWarning() {
            isClose = false;
        }
    }

    public static class MyThread4 extends Thread{

        @Override
        public void run() {
            BufferedReader reader;
            try{
                reader = new BufferedReader(new InputStreamReader(System.in));
                String strN;
                int sumNum = 0;
                while ((strN = reader.readLine()) != "N"){
                    if (strN.equals("N")){
                        break;
                    }
                    int sum = Integer.parseInt(strN);
                    sumNum += sum;
                }
                reader.close();
                System.out.println(sumNum);
            }catch (IOException io){
                io.getStackTrace();
            }
        }
    }
}
