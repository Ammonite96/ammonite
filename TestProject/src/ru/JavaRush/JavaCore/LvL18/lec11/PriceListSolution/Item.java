package ru.JavaRush.JavaCore.LvL18.lec11.PriceListSolution;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

/**
 *CrUD для таблицы внутри файла.
 * Считать с консоли имя файла для операций CrUD.
 * Программа запускается со следующим набором параметров:
 * -c productName price quantity
 *
 * Значения параметров:
 * где id - 8 символов.
 * productName - название товара, 30 символов.
 * price - цена, 8 символов.
 * quantity - количество, 4 символа.
 * -c - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле.
 *
 * В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
 * id productName price quantity
 *
 * Данные дополнены пробелами до их длины.
 *
 * Пример:
 * 19846   Шорты пляжные синие           159.00  12
 * 198478  Шорты пляжные черные с рисунко173.00  17
 * 19847983Куртка для сноубордистов, разм10173.991234
 */

public class Item {

    private String fileName;
    private ArrayList<String> data = new ArrayList<>();

    public Item(String fileName) throws IOException {
        this.fileName = fileName;
        String bufStr;
        BufferedReader fileIn = new BufferedReader(new FileReader(fileName));
        while ((bufStr = fileIn.readLine()) != null){
            data.add(bufStr);
        }
        fileIn.close();
    }

    public int MaxID(){
        int max = 0;
        for (String s : data) {
            int tmp = Integer.parseInt(s.substring(0, 8).trim());
            if (max < tmp) max = tmp;
        }
        return max;
    }

    public String FormatRec(int ID, String productName, double price, int quantity){
        return String.format(Locale.ENGLISH, "%-8d%-30.30s%-8.2f%-4d", ID, productName, price, quantity);
    }

    public void NewRec(String productName, double price, int quantity) {
        data.add(FormatRec(MaxID() + 1, productName, price, quantity));
    }

    public void WriteBD() throws IOException {
        StringBuilder sb = new StringBuilder(data.size());
        for (String s : data) {
            sb.append(s);
            sb.append("\r\n");
        }
        BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileName));
        fileOut.write(sb.toString());
        fileOut.close();
    }
}

