import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double number = Double.parseDouble(reader.readLine());
        double timer = number % 5;
        if (0 <= timer && timer < 3)
            System.out.println("зелёный");
        else if (3 <=timer && timer < 4)
            System.out.println("желтый");
        else if (4 <= timer && timer < 5)
            System.out.println("красный");
    }
}