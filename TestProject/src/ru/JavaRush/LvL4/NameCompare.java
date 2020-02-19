package TP1JavaRush4lvl;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class NameCompare {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите два имени: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name1 = reader.readLine();


        if (name.equals(name1))
            System.out.println("Имена идентичны");
        else if (name.length() == name1.length())
            System.out.println("Длины имен равны");

    }
}
//"Имена идентичны"
//"Длины имен равны"