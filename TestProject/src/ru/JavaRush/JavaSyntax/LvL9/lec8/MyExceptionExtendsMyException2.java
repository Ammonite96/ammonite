package ru.JavaRush.LvL9.lec8;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Есть четыре класса MyException, MyException2, MyException3, MyException4.
 * Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.
 *
 * Подсказка:
 * Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
 */

public class MyExceptionExtendsMyException2 {
    public static void main(String[] args) {
    }

    static class MyException extends FileNotFoundException {
    }

    static class MyException2 extends IOException {
    }

    static class MyException3 extends RuntimeException{
    }

    static class MyException4 extends IndexOutOfBoundsException{
    }
}
