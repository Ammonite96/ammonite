package ru.JavaRush.JavaCore.LvL18.lec11;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Считать с консоли 2 имени файла.
 * Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
 * Округлить числа до целых и записать через пробел во второй файл.
 * Закрыть потоки.
 * Принцип округления:
 * 3.49 => 3
 * 3.50 => 4
 * 3.51 => 4
 * -3.49 => -3
 * -3.50 => -3
 * -3.51 => -4
 */

public class RoundingNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine(), nameFile1 = reader.readLine();

        ArrayList<Long> result = new ArrayList<>();

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(nameFile));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(nameFile1));

        Scanner sc = new Scanner(new FileReader(nameFile));
        while (sc.hasNext()){
            String[] st = sc.nextLine().split(" ");
            for (String s : st) {
                double d = Double.parseDouble(s);
                int res = (int) Math.round(d);
                result.add((long) res);
            }
        }
        sc.close();
        inputStream.close();

        for (Long i : result){
            outputStream.write(i.toString().getBytes());
            outputStream.write(" ".getBytes());
        }
        outputStream.close();
    }
}

/*

public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine(), nameFile1 = reader.readLine();

        ArrayList<Double> doubles = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(nameFile));
        String values;
        while ((values = bufferedReader.readLine()) != null){
            values.split("\n");
            double value = Double.parseDouble(values);
            doubles.add(value);
        }
        bufferedReader.close();

        doubles.forEach(aDouble -> {
            int res = (int)Math.round(aDouble);
            result.add(res);
        });

        PrintWriter printWriter = new PrintWriter(new FileWriter(nameFile1));
        for (int i = 0; i < result.size(); i++){
            int re = result.get(i);
            printWriter.write(re + " ");
        }
        printWriter.close();
    }

 */