package ru.JavaRush.JavaMultithreading.LvL24.lec2.sol3;

import java.io.Serializable;
import java.rmi.Remote;
import java.util.ArrayDeque;
import java.util.EventListener;

/**
 * Исправь ошибки: перемести методы clone в те классы, в которых они должны быть реализованы.
 * Лишние методы удали.
 * Не удаляй метод main.
 */

public class Solution implements Serializable {
    public static class A implements Serializable {
        protected A clone() throws CloneNotSupportedException {
            return (A) super.clone();
        }
    }

    public static class B implements Remote {
        protected final B clone() throws CloneNotSupportedException {
            return (B) super.clone();
        }
    }

    public static class C extends ArrayDeque {
        public C clone() {
            return (C) super.clone();
        }

    }

    public static class D implements EventListener {
        protected D clone() throws CloneNotSupportedException {
            return (D) super.clone();
        }
    }

    /*
    protected Thread clone() throws CloneNotSupportedException {
        return (Thread) super.clone();
    }

    protected ArrayDeque clone() throws CloneNotSupportedException {
        return super.clone();
    }

     */

    public static void main(String[] args) {

    }
}
