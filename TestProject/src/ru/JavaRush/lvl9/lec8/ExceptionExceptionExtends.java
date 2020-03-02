package ru.JavaRush.lvl9.lec8;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
 * NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.
 *
 * Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
 * ArithmeticException и URISyntaxException.
 * Как это сделать?
 */

public class ExceptionExceptionExtends {
    public static void main(String[] args) throws ArithmeticException, URISyntaxException {
        //напишите тут ваш код
        try {
            method1();
        } catch (FileNotFoundException f){
            System.out.println("FileNotFoundException");
        }
        catch (NullPointerException n){
            System.out.println("NullPointerException");
        }
        //напишите тут ваш код
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
