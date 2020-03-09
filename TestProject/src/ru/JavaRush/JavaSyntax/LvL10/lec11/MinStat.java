package ru.JavaRush.JavaSyntax.LvL10.lec11;

/**
 * Расставьте как можно меньше модификаторов static так, чтобы пример скомпилировался.
 */

public class MinStat {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        //Solution solution = new Solution();
        MinStat minStat = new MinStat();
        minStat.A = 5;
        minStat.B = 5 * B;
        minStat.C = 5 * C * D;
        MinStat.D = 5 * D * C;

        MinStat.D = 5;
    }

    public int getA() {
        return A;
    }
}
