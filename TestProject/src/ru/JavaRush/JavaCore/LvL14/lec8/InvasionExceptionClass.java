package ru.JavaRush.JavaCore.LvL14.lec8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Заполни список exceptions десятью(10) различными исключениями.
 * Первое исключение уже реализовано в методе initExceptions.
 */

public class InvasionExceptionClass {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        try{
            String s = null;
            String m = s.toLowerCase();
        }catch (NullPointerException n){
            exceptions.add(n);
        }

        try{
            throw new IOException();
        } catch (IOException io) {
            exceptions.add(io);
        }

        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException i){
            exceptions.add(i);
        }

        try{
            Object o = new Object();
            InvasionExceptionClass inv = (InvasionExceptionClass) new Object();
        } catch (ClassCastException ce){
            exceptions.add(ce);
        }

        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException a) {
            exceptions.add(a);
        }

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException n){
            exceptions.add(n);
        }

        try {
            FileInputStream fin = new FileInputStream("test.txt");
        } catch (FileNotFoundException fn){
            exceptions.add(fn);
        }

        try{
           throw new ArrayStoreException();
        } catch (ArrayStoreException ae){
            exceptions.add(ae);
        }

        try{
            String[] strings = new String[-5];
        } catch (NegativeArraySizeException na){
            exceptions.add(na);
        }



        //напишите тут ваш код

    }
}
