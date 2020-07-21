package ru.JavaRush.JavaMultithreading.LvL24.lec6.sol3;

import java.util.List;

public class Solution {
    public static List<Jeans> allJeans = Util.getAllJeans();

    public static void main(String[] args) {
        for (Jeans jeans : allJeans) {
            System.out.println(jeans);
        }
    }
}
