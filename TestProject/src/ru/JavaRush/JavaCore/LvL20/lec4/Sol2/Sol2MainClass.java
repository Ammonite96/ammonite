package ru.JavaRush.JavaCore.LvL20.lec4.Sol2;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * Сделай так, чтобы сериализация класса JavaRush была возможной.
 */

public class Sol2MainClass {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) {

    }
}
