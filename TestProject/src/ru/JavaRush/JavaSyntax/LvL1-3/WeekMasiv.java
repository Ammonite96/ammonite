import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekMasiv {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите число от 1 до 7: ");
        BufferedReader day = new BufferedReader(new InputStreamReader(System.in));
        String weekday = day.readLine();
        int weekdaystr = Integer.parseInt(weekday);
        String[] dayarray = new String[]{"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        if (weekdaystr >= 1 && weekdaystr <= 7)
            System.out.println("Вы выбрали: " + dayarray[weekdaystr - 1]);
        else if (weekdaystr < 1 || weekdaystr > 7)
            System.out.println("Такого дня недели не существует!");


    }
}
