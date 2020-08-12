package ru.JavaRush.JavaMultithreading.LvL25.lec2.sol2;

/**
 * Используя возможности enum-а реализуй метод getLetterPosition, который должен возвращать позицию буквы.
 * Позиция буквы A - 1.
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(Alphabet.Z.getLetterPosition());
    }

    public enum Alphabet {
        A, B, C, D, E,
        F, G, H, I, J,
        K, L, M, N, O,
        P, Q, R, S, T,
        U, V, W, X, Y, Z;

        int getLetterPosition() {
            return ordinal()+1;
        }
    }
}
