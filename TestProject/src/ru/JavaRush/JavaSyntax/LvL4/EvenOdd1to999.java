/* if (num > 0 && num < 10) {
        if (num % 2 == 0)
            System.out.println("четное однозначное число");
        else {
            if (!(num % 2 == 0))
                System.out.println("нечетное однозначное число");
        }
    }
    if (num >= 10 && num < 100) {
        if (num % 2 == 0)
            System.out.println("четное двузначное число");
        else {
            if (!(num % 2 == 0))
                System.out.println("нечетное двузначное число");
        }
    }
    if (num >= 100 && num <= 999) {
        if (num % 2 == 0)
            System.out.println("четное трехзначное число");
        else {
            if (!(num % 2 == 0))
                System.out.println("нечетное трехзначное число");
        }
    }
}
}
*/

 /*     boolean a = (num > 1 && num < 10);
        boolean b = (num >= 10 && num < 100);
        boolean c = (num >= 100 && num <= 999);
        boolean d = (num % 2 == 0);
        boolean x = (!(num % 2 ==0));

        if (a && d)
            System.out.println("чоч");
        else if (a && x)
            System.out.println("нчоч");

        if (b && d)
            System.out.println("чдч");
        else if (b && x)
            System.out.println("нчдч");

        if (c && d)
            System.out.println("чтч");
        else  if(c && x)
            System.out.println("нчтч");
    }
}
*/
package TP1JavaRush4lvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd1to999 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if (num > 0 && num < 10) {
            if (num % 2 == 0)
                System.out.println("четное однозначное число");
            else {
                if (!(num % 2 == 0))
                    System.out.println("нечетное однозначное число");
            }
        }
        if (num >= 10 && num < 100) {
            if (num % 2 == 0)
                System.out.println("четное двузначное число");
            else {
                if (!(num % 2 == 0))
                    System.out.println("нечетное двузначное число");
            }
        }
        if (num >= 100 && num <= 999) {
            if (num % 2 == 0)
                System.out.println("четное трехзначное число");
            else {
                if (!(num % 2 == 0))
                    System.out.println("нечетное трехзначное число");
            }
        }
    }
}
