package ru.JavaRush.JavaMultithreading.LvL23.lec2.sol3;

/**
 * Запрети создание экземпляров класса Listener.
 */

public class Solution {
    public abstract static class Listener {
        public void onMouseDown(int x, int y) {
            // Do something when the mouse down event occurs
        }

        public void onMouseUp(int x, int y) {
            // Do something when the mouse up event occurs
        }
    }

    public static void main(String[] args) {

    }
}
