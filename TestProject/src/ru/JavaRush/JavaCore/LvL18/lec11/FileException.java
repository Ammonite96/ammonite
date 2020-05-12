package ru.JavaRush.JavaCore.LvL18.lec11;

import java.io.*;

/**
 * Читайте с консоли имена файлов.
 * Если файла не существует (передано неправильное имя файла),
 * то перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
 * Закрыть потоки.
 * Не используйте System.exit();
 */

public class FileException {
    public static void main(String[] args) {
        String nameFile = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream inputStream = null;
            while ((nameFile = reader.readLine()) != null){
                inputStream = new FileInputStream(nameFile);
                if (nameFile == null)
                    break;
            }
            reader.close();
            inputStream.close();
        }catch (FileNotFoundException fl){
            System.out.println(nameFile);
        }catch (IOException io){io.getMessage();}
    }
}
