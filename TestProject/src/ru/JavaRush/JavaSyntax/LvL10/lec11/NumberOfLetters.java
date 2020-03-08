package ru.JavaRush.JavaSyntax.LvL10.lec11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.
 *
 * Пример вывода:
 * а 5
 * б 8
 * в 3
 * г 7
 * д 0
 * ...
 * я 9
 */

public class NumberOfLetters {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        ArrayList<Character> strToChar = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            String str = list.get(i);
            for (int j = 0; j < str.length(); j++ ) {
                char[] strChar = str.toCharArray();
                char ch = strChar[j];
                strToChar.add(ch);
            }
        }
        Collections.sort(strToChar);

        for (int i = 0; i < alphabet.size(); i++){
            char abcChar = alphabet.get(i);
            int count = 0;
            for (int j = 0; j < strToChar.size(); j++){
                char ch = strToChar.get(j);
                if (abcChar != ch){
                    count = 0;
                }
                if (abcChar == ch){
                    count++;
                    System.out.println(alphabet.get(i) + " " + count);
                }
            }
        }
    }
}

/*

Машина
Перерыв
Скакун
Телефон
Игра
пророк
Яблоко
платок
дерево
уксус

 */

/*

а
бб
ввв
гггг
ддддд
ёёёёёё
жжжжжжж
зззззззз
иииииииии
кккккккккк

 */


/*

ArrayList<Character> strToChar = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            String str = list.get(i);
            for (int j = 0; j < str.length(); j++ ) {
                char[] strChar = str.toCharArray();
                char ch = strChar[j];
                strToChar.add(ch);
            }
        }
        Collections.sort(strToChar);

        Map<Character, Integer> numChar = new TreeMap<>();
        Integer value = 0;
        for (int i = 0; i < alphabet.size(); i++){
           Character charAlphabet = alphabet.get(i);
            //numChar.put(charAlphabet, null);
           for (int j = 0; j < strToChar.size(); j++){
               char ch = strToChar.get(j);
               if (charAlphabet != ch)
                   value = 0;
               if (charAlphabet == ch){
                   value ++;
                   numChar.put(charAlphabet, value);
               }
           }
        }

        for (Map.Entry<Character, Integer> pair : numChar.entrySet()){
            Character key = pair.getKey();
            Integer value1 = pair.getValue();
            if (value1 == null)
                value1 = 0;
            System.out.println(key + " " + value1);
        }

 */