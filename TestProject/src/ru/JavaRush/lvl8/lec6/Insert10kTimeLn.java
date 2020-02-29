package ru.JavaRush.lvl8.lec6;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
 * Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.
 */

public class Insert10kTimeLn {
    public static void main(String[] args) {

        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date startTime = new Date();
        insert10000(list);
        Date currentTime = new Date();
        long timeDistance = currentTime.getTime() - startTime.getTime();
        return timeDistance;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
