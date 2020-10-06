package ru.JavaRush.JavaMultithreading.LvL28.lec4.sol2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Класс Solution будет использоваться трэдами.
 * Реализуй логику всех методов, используйте класс ThreadLocalRandom.
 * getRandomIntegerBetweenNumbers должен возвращать случайный int между from и to.
 * getRandomDouble должен возвращать случайный double.
 * getRandomLongBetween0AndN должен возвращать случайный long между 0 и n.
 */

public class Solution {
    public static int getRandomIntegerBetweenNumbers(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to);
    }

    public static double getRandomDouble() {
        return ThreadLocalRandom.current().nextDouble();
    }

    public static long getRandomLongBetween0AndN(long n) {
        return ThreadLocalRandom.current().nextLong(n);
    }

    public static void main(String[] args) {
    }
}
