package ru.JavaRush.JavaCore.LvL13.lec11;

import java.io.*;
import java.util.ArrayList;

/**
 * 1. Считать с консоли имя файла.
 * 2. Вывести в консоль(на экран) содержимое файла.
 * 3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
 */

public class ClassSolution3FileRead {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        InputStream file = new FileInputStream(nameFile);
       // BufferedInputStream buffer = new BufferedInputStream(file);

        ArrayList<Character> list = new ArrayList<>();
        while (file.available()>0) {
            char c = (char) file.read();
            list.add(c);
        }

        for (Character c : list){
            System.out.print(c);
        }
        reader.close();
        file.close();
    }
}
/*
/home/ammonite/IdeaProject/ammonite/TestProject/src/ru/JavaRush/JavaCore/LvL13/lec11/test.txt
 */