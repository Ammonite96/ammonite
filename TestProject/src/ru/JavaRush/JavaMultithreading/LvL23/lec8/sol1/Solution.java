package ru.JavaRush.JavaMultithreading.LvL23.lec8.sol1;

/**
 * Метод printName должен выводить имя собственного объекта, т.е. "The Darkside Hacker"
 * Сделайте минимум изменений.
 */

public class Solution {
    private String name;

    Solution(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void sout() {
        new Solution("The Darkside Hacker") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Solution("Риша").sout();
    }
}
