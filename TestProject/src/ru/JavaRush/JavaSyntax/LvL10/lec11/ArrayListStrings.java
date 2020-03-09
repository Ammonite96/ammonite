package ru.JavaRush.JavaSyntax.LvL10.lec11;

import java.util.ArrayList;

/**
 * Создать массив, элементами которого будут списки строк.
 * Заполнить массив любыми данными и вывести их на экран.
 */

public class ArrayListStrings {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] stringList = new ArrayList[5];
        for (int i = 0; i < stringList.length; i++){
            stringList[i] = new ArrayList<>();
            stringList[i].add("String" + i);
        }
        return stringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}

