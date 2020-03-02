package ru.JavaRush.LvL9.lec8;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * В методе handleExceptions обработайте все checked исключения.
 * Нужно вывести на экран возникшее checked исключение.
 * Можно использовать только один блок try..catch
 */

public class CatchingCheckedException {
    public static void main(String[] args) {
        handleExceptions(new CatchingCheckedException());

    }

    public static void handleExceptions(CatchingCheckedException obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (NoSuchFieldException ns){
            System.out.println(ns);
        } catch (IOException io){
            System.out.println(io);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
