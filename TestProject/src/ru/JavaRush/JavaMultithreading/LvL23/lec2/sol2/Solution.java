package ru.JavaRush.JavaMultithreading.LvL23.lec2.sol2;

/**
 * Запрети переопределение метода onMouseDown.
 */

public class Solution {
    public static class Listener {
        public final void onMouseDown(int x, int y) {
            // Do something when the mouse down event occurs
        }

        public void onMouseUp(int x, int y) {
            // Do something when the mouse up event occurs
        }
    }

    public static void main(String[] args) {

    }
}
