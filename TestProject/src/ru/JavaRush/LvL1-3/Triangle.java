import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите стороны треугольника: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int aSides = Integer.parseInt(reader.readLine());
        int bSides = Integer.parseInt(reader.readLine());
        int cSides = Integer.parseInt(reader.readLine());

        int a = aSides;
        int b = bSides;
        int c = cSides;


        if ((a + b) > c && (a + c) > b && (c + b) > a)
            System.out.println("Такой треугольник существует!");
        else
            System.out.println("Такой треагольник не существует");


    }
}
