
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NumOutput {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите число и нажмите Enter: ");
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        String number = num.readLine();
        int numberstring = Integer.parseInt(number);


        if (numberstring > 0)
            System.out.println(numberstring * 2);
        else if (numberstring < 0)
            System.out.println(numberstring + 1);
        else if (numberstring == 0)
            System.out.println(numberstring);

    }
}
