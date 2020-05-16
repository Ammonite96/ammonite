package ru.JavaRush.JavaCore.LvL18.lec11.PriceListSolution;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

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

public class PriceList {
    public static void main(String[] args) throws Exception {
        if (args.length != 4) return;
        BufferedReader rcon = new BufferedReader(new InputStreamReader(System.in));
        String fileName = rcon.readLine();
        rcon.close();
        File f = new File(fileName);
        if (!f.isFile()) f.createNewFile();
        if (args[0].equals("-c")) {
            Item item = new Item(fileName);
            item.NewRec(args[1], Double.parseDouble(args[2]), Integer.parseInt(args[3]));
            item.WriteBD();
        }
    }
}
