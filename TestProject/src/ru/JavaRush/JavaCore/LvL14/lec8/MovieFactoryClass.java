package ru.JavaRush.JavaCore.LvL14.lec8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Расширение функционала по аналогии, чтение с консоли:
 * 1. Разобраться, что программа умеет делать.
 * 2. Все классы должны быть внутри класса Solution.
 * 3. Добавить классы Cartoon, Thriller.
 * 4. Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
 * Аналогично получению объекта SoapOpera сделать:
 * 5. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
 * 6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
 * 7. Считать с консоли несколько ключей (строк).
 * 7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
 * 8. Создать переменную movie типа Movie и для каждой введенной строки(ключа):
 * 8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
 * 8.2. Вывести на экран movie.getClass().getSimpleName().
 */

public class MovieFactoryClass {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
        Movie movie = null;
        //ввести с консоли несколько ключей (строк), пункт 7
        while (true) {
            String str = reader.readLine();
            if (str.equals("soapOpera") || str.equals("cartoon") || str.equals("thriller")) {
                key = str;
                movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
            }else if (!(str.equals("soapOpera") || str.equals("cartoon") || str.equals("thriller"))){
                key = str;
                movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
                break;
            }
                //System.out.println(movie.getClass().getSimpleName());
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key))
                movie = new Cartoon();
            if ("thriller".equals(key))
                movie = new Thriller();
            if (!(key.equals("soapOpera") || key.equals("cartoon") || key.equals("thriller")))
                movie = new Thriller();

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {}
    static class Thriller extends Movie {}
    //Напишите тут ваши классы, пункт 3
}
