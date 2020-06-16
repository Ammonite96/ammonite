package ru.JavaRush.JavaCore.LvL20.lec10.Sol2;

import java.io.*;

/**
 * На вход подается поток, в который записан сериализованный объект класса A либо класса B.
 * Десериализуй объект в методе getOriginalObject так, чтобы в случае возникновения исключения было выведено сообщение на экран и возвращен null.
 * Реализуй интерфейс Serializable где необходимо.
 */

public class Sol2MainClass {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            Object o = objectStream.readObject();
            if (o instanceof A)
                return (A) o;
            else return null;

        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
