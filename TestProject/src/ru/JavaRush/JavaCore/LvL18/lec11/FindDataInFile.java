package ru.JavaRush.JavaCore.LvL18.lec11;

import java.io.*;
import java.util.ArrayList;

/**
 * Считать с консоли имя файла.
 * Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
 * Программа запускается с одним параметром: id (int).
 * Закрыть потоки.
 * В файле данные разделены пробелом и хранятся в следующей последовательности:
 * id productName price quantity
 * где id - int.
 * productName - название товара, может содержать пробелы, String.
 * price - цена, double.
 * quantity - количество, int.
 *
 * Информация по каждому товару хранится в отдельной строке.
 */

public class FindDataInFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        ArrayList<String> stringList = new ArrayList<>();
        //BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        String strLine;
        while ((strLine = fileReader.readLine()) != null){
            if (strLine.startsWith((args[0]+" "))){
                System.out.println(strLine);
                break;      // Либо моё решение stringList.add(strLine);   И далее через цикл for
            }
        }
        reader.close();
        fileReader.close();
    }
}

/*
Моё решение.

for (int i = 0; i < stringList.size(); i++){
            String str = stringList.get(i);
            String[] split = str.split(" ");
            int id = Integer.parseInt(split[0]);
            if (id == (Integer.parseInt(args[0]))){
                System.out.println(str);
            }
        }

 */