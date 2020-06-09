package ru.JavaRush.JavaCore.LvL20.lec2.Sol3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Метод main() считывает имя файла с консоли и заполняет runtimeStorage данными из файла.
 * В методах save() и load() реализуй логику записи в файл и чтения из файла для карты runtimeStorage.
 * Файл должен быть в формате .properties. Комментарии в файле можно игнорировать.
 * Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
 */

public class MainClass {
    public static Map<String, String> runtimeStorage = new HashMap<>();


    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
        Properties prop = new Properties();
        prop.putAll(runtimeStorage);
        prop.store(outputStream, null);
    }

    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
        Properties prop = new Properties();
        prop.load(inputStream);
        prop.forEach((o, o2) -> runtimeStorage.put(o.toString(), o2.toString()));
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
