package ru.JavaRush.JavaMultithreading.LvL21.lec5.Sol2;

/**
 * Сравнение объектов Solution не работает должным образом. Найти ошибку и исправить.
 * Метод main не участвует в тестировании.
 */

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;
        Solution solution = (Solution) o;
        return Objects.equals(first, solution.first) &&
                Objects.equals(last, solution.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
