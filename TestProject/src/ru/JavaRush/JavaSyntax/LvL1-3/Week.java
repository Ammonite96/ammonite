import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите число от 1 до 7: ");
        BufferedReader day = new BufferedReader(new InputStreamReader(System.in));
        String weekday = day.readLine();
        int weekdaystr = Integer.parseInt(weekday);
       checkDay(weekdaystr);

    }

    public static void checkDay(int weekdaystr) {
        if (weekdaystr == 1)
            System.out.println("Понедельник");
        else if (weekdaystr == 2)
            System.out.println("Вторник");
        else if (weekdaystr == 3)
            System.out.println("Среда");
        else if (weekdaystr == 4)
            System.out.println("Четверг");
        else if (weekdaystr == 5)
            System.out.println("Пятница");
        else if (weekdaystr == 6)
            System.out.println("Суббота");
        else if (weekdaystr == 7)
            System.out.println("Воскресенье");
        else if (weekdaystr > 7 || weekdaystr < 1)
            System.out.println("Такого дня недели не существует");
    }

}
