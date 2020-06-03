package ru.JavaRush.JavaCore.LvL19.lec11.Sol6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * В метод main первым параметром приходит имя файла.
 * В этом файле каждая строка имеет следующий вид:
 * имя день месяц год
 * где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
 * [день] - int, [месяц] - int, [год] - int
 * данные разделены пробелами.
 * Заполнить список PEOPLE используя данные из файла.
 * Закрыть потоки.
 *
 * Пример входного файла:
 * Иванов Иван Иванович 31 12 1987
 * Вася 15 5 2013
 */

public class MainClass {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));

        while (fileReader.ready()){
            String dataFile = fileReader.readLine();
            String[] arrayName = dataFile.split("\\s[0-9\\s*]+");
            String[] arrayBirthDay = dataFile.split("^\\w*\\W*\\D*");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Date form = dateFormat.parse(arrayBirthDay[1]);
            PEOPLE.add(new Person(arrayName[0], form));
        }
        fileReader.close();

        PEOPLE.forEach(person -> System.out.println(person.getName() + " " + person.getBirthDate()));
    }
}


/*

В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами.
Заполнить список PEOPLE используя данные из файла.
Закрыть потоки.

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013

 */

// ^\W*\b
// [^0-9\s*]+
// ^\w*\W*\D*