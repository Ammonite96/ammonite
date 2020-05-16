package ru.JavaRush.JavaCore.LvL19.lec3.Adapter1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {
        File file = new File("test3");
        Scanner scanner = new Scanner(file);
        PersonScannerAdapter adapter = new PersonScannerAdapter(scanner);
        //adapter.read();
        System.out.println(adapter.read().toString());
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String person = fileScanner.nextLine();
            String[] parse = person.split(" ");
            String firstName = parse[1];
            String middleName = parse[2];
            String lastName = parse[0];
            String date = parse[3] + " " + parse[4] + " " + parse[5];
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            Date birthDate = null;
            try {
                birthDate = dateFormat.parse(date);
                System.out.println(birthDate.toString());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
