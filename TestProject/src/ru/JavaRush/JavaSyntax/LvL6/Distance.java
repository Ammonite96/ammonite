package ru.JavaRush.LvL6;

/**
 * Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
 * Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.
 */

public class Distance {

    private static int x1 = 2;
    private static int x2 = 7;
    private static int y1 = 9;
    private static int y2 = 12;

    static double square (double a){
        double result = a*a;
        return result;
    }

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double x2x1 = square(x2 - x1);
        double y2y1 = square(y2 -y1);
        double distance = Math.sqrt(x2x1 + y2y1);
        //System.out.println(distance);
        return distance;
    }

    public static void main(String[] args) {
        Distance distance = new Distance();
        distance.getDistance(2, 9,7,12);
    }
}
