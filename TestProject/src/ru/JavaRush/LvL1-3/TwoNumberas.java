import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoNumberas {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите 3 числа через Enter: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        if (number == number1 && number == number2 && number1 == number2)
            System.out.println(number + " " + number1 + " " + number2);
        else if (number == number1)
            System.out.println(number + " " + number1);
        else if (number == number2)
            System.out.println(number + " " + number2);
        else if (number1 == number2)
            System.out.println(number1 + " " + number2);

    }
}
