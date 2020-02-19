package Solution;

public class Chapter5MixFor5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                //x = x + 3;    // вывод 54 6;
                //x = x + 6;    // вывод 60 10;
                //x = x + 2;    // вывод 45 6;
                //x++;      //вывод 36 6;
                //x--;      //вывод 18 6;
                x = x + 0;      //вывод 6 14;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}
