package ru.JavaRush.JavaMultithreading.LvL26.lec8.sol1;

/**
 * В классе Solution создай public static класс IntegerHolder.
 * IntegerHolder должен быть для типа int (имя переменной должно быть value), быть thread safe и изменяемым.
 * В этом классе должны быть два public метода get и set.
 */

public class Solution {
    public static void main(String[] args) {

    }

    public static class IntegerHolder {
        private int value;

        public synchronized int getValue() {
            return value;
        }

        public synchronized void setValue(int value) {
            this.value = value;
        }
    }
}
