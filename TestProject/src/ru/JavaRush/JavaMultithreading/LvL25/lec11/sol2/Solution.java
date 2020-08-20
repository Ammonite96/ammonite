package ru.JavaRush.JavaMultithreading.LvL25.lec11.sol2;

/**
 *Обеспечь переуступку кванта времени (переход хода для текущей нити) для последовательных выводов текста в консоль.
 */

/*
Первый закон Финэйгла: если эксперимент удался, что-то здесь не так...
*/
public class Solution {
    public static class YieldRunnable implements Runnable {
        private int index;

        public YieldRunnable(int index) {
            this.index = index;
        }

        public void run() {
            System.out.println("begin-" + index);
            Thread.yield();
            System.out.println("end-" + index);
        }
    }

    public static void main(String[] args) {
    }
}
