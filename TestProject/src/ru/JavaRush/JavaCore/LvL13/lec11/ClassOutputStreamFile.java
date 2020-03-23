package ru.JavaRush.JavaCore.LvL13.lec11;

import java.io.*;

/**
 * 1. Прочесть с консоли имя файла.
 * 2. Считывать строки с консоли, пока пользователь не введет строку "exit".
 * 3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
 */

public class ClassOutputStreamFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        BufferedWriter bufW = new BufferedWriter(new FileWriter(nameFile));
        while (true){
            String str = reader.readLine();
            bufW.write(str + "\n");
            bufW.flush();
            if (str.contains("exit"))
                break;
        }
        reader.close();
        bufW.close();
    }
}

/*
/home/ammonite/IdeaProject/ammonite/TestProject/src/ru/JavaRush/JavaCore/LvL13/lec11/test.txt
 */