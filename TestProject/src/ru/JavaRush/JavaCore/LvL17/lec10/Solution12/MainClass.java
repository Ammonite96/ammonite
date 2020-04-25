package ru.JavaRush.JavaCore.LvL17.lec10.Solution12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String firstFile = reader.readLine();
            String secondFile = reader.readLine();
            reader.close();

            BufferedReader readerFirstFile = new BufferedReader(new InputStreamReader(new FileInputStream(firstFile)));
            String lineString;
            while ((lineString = readerFirstFile.readLine()) != null){
                allLines.add(lineString);
            }
            readerFirstFile.close();

            BufferedReader readerSecondFile = new BufferedReader(new InputStreamReader(new FileInputStream(secondFile)));
            String lineString1;
            while ((lineString1 = readerSecondFile.readLine()) != null){
                forRemoveLines.add(lineString1);
            }
            readerSecondFile.close();

        } catch (IOException ex){ex.printStackTrace();}

        MainClass mainClass = new MainClass();
        try {
            mainClass.joinData();
        } catch (CorruptedDataException e) {
            e.getMessage();
        }
        System.out.println(allLines.size() + " " + allLines.toString());
        System.out.println(forRemoveLines.size() + " " + forRemoveLines.toString());
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
