package ru.JavaRush.JavaCore.LvL18.lec11.PriceListSolution;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class asas {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        StringBuilder productName = new StringBuilder();

        for (int i = 1; i < args.length - 2; i++) {
            productName.append(args[i]).append(" ");
        }
        String trueProductName = setSpaces(productName.toString(), 30);

        String truePrice = setSpaces(args[args.length - 2], 8);
        String trueQuantity = setSpaces(args[args.length - 1], 4);

        String id = getId(fileName);
        id = setSpaces(id, 8);
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        printWriter.println(id + trueProductName + truePrice + trueQuantity);
        printWriter.close();

    }

    private static String getId(String fileName) throws IOException {
        ArrayList<Long> allIds = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        Long currentId;
        while ((line = bufferedReader.readLine()) != null) {
            line = line.substring(0, 8).replaceAll("\\s", "");
            currentId = Long.parseLong(line);
            allIds.add(currentId);
        }
        bufferedReader.close();
        Long maxId = Collections.max(allIds);
        Long MyId = maxId + 1;
        return MyId.toString();
    }


    @SuppressWarnings("Duplicates")
    private static String setSpaces(String previousName, int count) {
        String trueName;
        if (previousName.length() > count) {
            trueName = previousName.substring(0, count);
        } else {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < (count - previousName.length()); i++) {
                s.append(" ");
            }
            trueName = previousName + s;
        }
        return trueName;
    }
}
