package Solution;

public class Chapter5MultiFour {
    public static void main(String[] args) {
        for (int x = 0; x < 4; x++){
            if (x==1) {                 //если if тут то выводится 0 0, 2 2, 3 3
                x++;
            }
            for (int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            }
            //if (x==1) {                 //если if тут то выводится 0 0, 1 1, 3 3
                //x++;
            //}
        }
    }
}
// if (x==1)
// x++;