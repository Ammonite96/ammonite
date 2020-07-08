package ru.JavaRush.JavaMultithreading.LvL22.lec9.sol1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
 * Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
 * Использовать StringBuilder.
 * Кодировка файла - UTF-8.
 * <p>
 * Пример содержимого файла
 * рот тор торт о
 * о тот тот тот
 * <p>
 * Вывод:
 * рот тор
 * о о
 * тот тот
 */

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
        String fileName = readerConsole.readLine();
        BufferedReader readerFile = new BufferedReader(new FileReader(fileName));
        String data="";
        String s;
        while ((s= readerFile.readLine())!=null){
            data+=s+" ";
        }

        String[] massString = data.split(" ");
        for (int i = 0; i < massString.length; i++) {
            for (int j = 0; j < massString.length; j++) {
                if (i==j||massString[i]==null||massString[j]==null) continue;
                StringBuilder a = new StringBuilder(massString[i]);
                StringBuilder b = new StringBuilder(massString[j]);
                if (a.toString().equals(b.reverse().toString())) {
                    Pair pair = new Pair();
                    pair.first= a.toString();
                    pair.second=b.reverse().toString();
                    result.add(pair);
                    massString[i]=null;
                    massString[j]=null;
                }
            }
        }

        result.forEach(pair -> System.out.println(pair));
    }

    public static class Pair {
        String first;
        String second;

        public Pair(){}

        public Pair (String s, String s1){
            first = s;
            second = s1;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }
}

/*
 public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "test";
        //reader.close();
        BufferedReader is = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<String> checkString = new ArrayList<>();
        String s;
        while ((s = is.readLine()) != null) {
            String[] splitS = s.split(" ");
            for (String string : splitS)
                checkString.add(string);
        }
        is.close();

        for (int i = 0; i < checkString.size(); i++){
            String revers = new StringBuilder(checkString.get(i)).reverse().toString();
            for (int j = i+1; j < checkString.size(); j++){
                if (revers.equals(checkString.get(j))) {
                    Pair pair1 = new Pair(checkString.get(i), checkString.get(j));
                    Pair pair2 = new Pair(checkString.get(j), checkString.get(i));
                    if (!result.contains(pair1) && !result.contains(pair2)) {
                        result.add(pair1);
                    }
                }
            }
        }
        result.forEach(pair -> System.out.println(pair));
    }
 */