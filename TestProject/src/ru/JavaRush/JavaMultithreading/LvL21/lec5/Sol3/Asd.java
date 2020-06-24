package ru.JavaRush.JavaMultithreading.LvL21.lec5.Sol3;

import java.util.Date;
import java.util.Objects;

public class Asd {
    /**
     * Исправьте ошибки реализаций методов equals и hashCode для класса Solution.
     */

    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private ru.JavaRush.JavaMultithreading.LvL21.lec5.Sol3.Solution solution;

    public Asd(int anInt, String string, double aDouble, Date date, ru.JavaRush.JavaMultithreading.LvL21.lec5.Sol3.Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asd)) return false;
        Asd asd = (Asd) o;
        return anInt == asd.anInt &&
                Double.compare(asd.aDouble, aDouble) == 0 &&
                Objects.equals(string, asd.string) &&
                Objects.equals(date, asd.date) &&
                Objects.equals(solution, asd.solution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anInt, string, aDouble, date, solution);
    }

    public static void main(String[] args) {

    }
}
