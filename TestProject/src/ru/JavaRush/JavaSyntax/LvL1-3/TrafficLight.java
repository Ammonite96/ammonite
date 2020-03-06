import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double number = Double.parseDouble(reader.readLine());

        if (number > 0 && number < 3 || number >= 5 && number < 8 || number >= 10 && number < 13 || number >= 15 && number < 18 || number >= 20 && number < 23 || number >= 25 && number < 28 || number >= 30 && number < 33 || number >= 35 && number < 38 || number >= 40 && number < 43 || number >= 45 && number < 48 || number >= 50 && number < 53 || number >= 55 && number < 58 || number == 60)
            System.out.println("Зеленый");
        else if (number >= 3 && number < 4 || number >= 8 && number < 9 || number >= 13 && number < 14 || number >= 18 && number < 19 || number >= 23 && number < 24 || number >= 28 && number < 29 || number >= 33 && number < 34 || number >= 38 && number < 39 || number >= 43 && number < 44 || number >= 48 && number < 49 || number >= 53 && number < 54 || number >= 58 && number < 59)
            System.out.println("Желтый");
        else
            System.out.println("Красный");
    }
}