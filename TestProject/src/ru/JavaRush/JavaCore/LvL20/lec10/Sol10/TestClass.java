package ru.JavaRush.JavaCore.LvL20.lec10.Sol10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(testClass.generateNumber(2)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);


    }

    private long[] generateNumber(long N) {
        long[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370,
                371, 407, 1634, 8208, 9474, 54748, 92727, 93084,
                548834, 1741725, 4210818, 9800817, 9926315, 24678050,
                24678051, 88593477, 146511208, 472335975, 534494836, 912985153,
                4679307774L, 32164049650L, 32164049651L, 40028394225L, 42678290603L,
                44708635679L, 49388550606L, 82693916578L, 94204591914L, 28116440335967L,
                4338281769391370L, 4338281769391371L, 21897142587612075L, 35641594208964132L,
                35875699062250035L, 1517841543307505039L, 3289582984443187032L, 4498128791164624869L, 4929273885928088826L};

        ArrayList<Long> listTemp = new ArrayList<>();

        for (int i = 0; i < temp.length; i++){
            if (N > temp[i])
                listTemp.add(temp[i]);
        }

        long[] result = new long[listTemp.size()];
        for (int i = 0; i < listTemp.size(); i++){
            result[i] = listTemp.get(i);
        }

        return result;
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
