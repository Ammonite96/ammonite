import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfYear {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите год: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());


        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");

    }
}