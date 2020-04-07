package ru.JavaRush.JavaCore.LvL16.lec3;

import java.util.ArrayList;
import java.util.List;

/**
 * В методе main добавить в статический объект list 5 нитей.
 * Каждая нить должна быть новым объектом класса Thread,
 * работающим со своим объектом класса SpecialThread.
 */

public class ListAndThread {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        Thread thread = new Thread(new SpecialThread());
        Thread thread1 = new Thread(new SpecialThread());
        Thread thread2 = new Thread(new SpecialThread());
        Thread thread3 = new Thread(new SpecialThread());
        Thread thread4 = new Thread(new SpecialThread());

        list.add(thread);
        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
