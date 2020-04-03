package ru.JavaRush.JavaCore.LvL15.lec12.Solution7File;

/**
 * 1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
 * 2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainClassSol7 {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Static.FILE_NAME)));
            String str;
            while (true){
                str = reader.readLine();
                if (str == null)
                    break;
                lines.add(str);
            }
            reader.close();
        } catch (FileNotFoundException fl){
            System.out.println(fl.getMessage());
        } catch (IOException io){
            System.out.println(io.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(lines.size());
        System.out.println(lines);
    }
}
