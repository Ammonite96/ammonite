package ru.JavaRush.JavaCore.LvL19.lec11.Sol3ParserHTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Считайте с консоли имя файла, который имеет HTML-формат.
 * Пример:
 * Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela
 * </span></b></span><span>Super</span><span>girl</span>
 * <p>
 * Первым параметром в метод main приходит тег. Например, "span".
 * Вывести на консоль все теги, которые соответствуют заданному тегу.
 * Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле.
 * Количество пробелов, \n, \r не влияют на результат.
 * Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нет.
 * Тег может содержать вложенные теги.
 * <p>
 * Пример вывода:
 * <span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
 * <span>Turanga Leela</span>
 * <span>Super</span>
 * <span>girl</span>
 * <p>
 * Шаблон тега:
 * <tag>text1</tag>
 * <tag text2>text1</tag>
 * <tag
 * text2>text1</tag>
 * <p>
 * text1, text2 могут быть пустыми
 */

public class MyParser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(nameFile));
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        while ((line = fileReader.readLine()) != null){
            stringBuilder.append(line);
        }
        fileReader.close();

        Document document = Jsoup.parse(stringBuilder.toString(),"", Parser.xmlParser()); //Parser.htmlParser();
        Elements elem = document.select(args[0]);
        for (Element elements : elem){
            System.out.println(elements);
        }
    }
}

// SimpleHTML2.html
// SH.html

/*
Document doc = Jsoup.connect("https://javarush.ru/quests/lectures/questcore.level09.lecture11").get();
        String title = doc.title();
        System.out.println("Title : " + title);
 */

/*
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(nameFile));
        ArrayList<String> dataArray = new ArrayList<>();
        while (fileReader.ready()) {
            String dataFile = fileReader.readLine();
            if (dataFile.contains("<"+args[0]) || dataFile.contains("</"+args[0]))
                dataArray.add(dataFile);
        }
        fileReader.close();

        dataArray.forEach(s -> {
            Document document = Jsoup.parse(s);
            Elements tag = document.body().getElementsByTag(args[0]);
            System.out.println(tag);
            System.out.println(s);
        });
    }
 */