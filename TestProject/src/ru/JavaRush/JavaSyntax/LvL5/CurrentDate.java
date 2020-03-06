package ru.JavaRush.LvL5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

    public static void main(String[] args){

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(dateFormat.format(date));

        System.out.println("23" + " " + "01" + " " + "2020");

    }
}
