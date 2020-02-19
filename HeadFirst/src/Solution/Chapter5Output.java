package Solution;

public class Chapter5Output {
    public static void main(String[] args) {
        Chapter5Output o = new Chapter5Output();
        o.go();
    }

    void go() {
        int y = 7;
        int x;
        for (x = 1; x < 8; x++) {
            y++;
            if (x > 4)
                System.out.print(++y + " ");

            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}