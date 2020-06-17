package ru.JavaRush.JavaCore.LvL20.lec10.Sol10;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        long a = System.currentTimeMillis();
        System.out.println(testClass.ArmstrongNumbers(370));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024));
        System.out.println("time = " + (b - a) / 1000);


    }


    private boolean ArmstrongNumbers(long n) {
        long num = n;
        String s = String.valueOf(num);
        int pow = s.length();

        List<Long> list = new ArrayList<>();
        while (num > 0) {
            long l = num % 10;
            num /= 10;
            list.add(l);
        }

        long result = 0;
        for (int i = 0; i < list.size(); i++) {
            long p = list.get(i);
            long numPow = (long) Math.pow(p, pow);
            result += numPow;
        }

        if (result == n)
            return true;
        else
            return false;
    }
}
