package ru.JavaRush.JavaCore.LvL16.lec13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Разберись, что делает программа.
 * 2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
 * 3. Внутри класса Solution создай нить public static ReadFileThread, которая реализует
 * интерфейс ReadFileInterface (Подумай, что больше подходит - Thread или Runnable).
 * 3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
 * 3.2. Метод getFileContent должен возвращать содержимое файла.
 * 3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
 * 4. Подумай, в каком месте нужно подождать окончания работы нити, чтобы обеспечить последовательный вывод файлов.
 * 4.1. Для этого добавь вызов соответствующего метода.
 * Ожидаемый вывод:
 * [все тело первого файла]
 * [все тело второго файла]
 */

public class Thread9MainClass {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        }catch (IOException io){}
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        ArrayList<String> strings = new ArrayList<>();
        String file;
        String result = "";
        @Override
        public void run() {
            try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String str;
                while ((str = reader.readLine()) != null){
                    strings.add(str);
                }
                reader.close();

            } catch (IOException io){}
        }

        @Override
        public void setFileName(String fullFileName) {
           file = fullFileName;
        }

        @Override
        public String getFileContent() {
            for (int i = 0; i < strings.size(); i++){
                result = result + strings.get(i) + " ";
            }
            return result;
        }
    }
}
