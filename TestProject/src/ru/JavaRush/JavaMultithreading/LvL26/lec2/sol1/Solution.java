package ru.JavaRush.JavaMultithreading.LvL26.lec2.sol1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Солдаты всегда строились, строятся и будут строиться по убыванию роста.
 * Отсортируй солдат, предварительно подумав, что лучше использовать при таких условиях - Comparable или Comparator.
 */

public class Solution {
    public static void main(String[] args) {
        Set<Soldier> soldiers = new TreeSet<>();
        soldiers.add(new Soldier("Ivanov", 170));
        soldiers.add(new Soldier("Petrov", 180));
        soldiers.add(new Soldier("Sidorov", 175));
        soldiers.add(new Soldier("syka", 165));

        for (Soldier soldier : soldiers) {
            System.out.println(soldier.name);
        }
    }

    public static class Soldier implements Comparable<Soldier> {
        private String name;
        private int height;

        public Soldier(String name, int height) {
            this.name = name;
            this.height = height;
        }

        @Override
        public int compareTo(Soldier o) {
            return o.height - this.height;
        }
    }
}
