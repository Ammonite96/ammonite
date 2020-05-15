package ru.JavaRush.JavaCore.LvL18.lec11.PriceListSolution;

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

    private int id;
    private double price;
    private int quantity;
    private String productName;

    public Item(int id, String productName, double price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.productName = productName;
    }

    @Override
    public String toString(){
        String formatPrice = String.format("%-8.2f", price);
        String formatQuantity = String.format("%-4d", quantity);
        return String.format("%-8d%-30.30s%-8.8s%-4.4s\n",id, productName, formatPrice, formatQuantity);
    }
}
