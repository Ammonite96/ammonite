package ru.JavaRush.JavaCore.LvL17.lec10.Solution5;

public class MainClass {
    public static void main(String[] args) {
        Beach beach = new Beach("Beach1", 2.2f, 6);
        Beach beach1 = new Beach("Beach2", 1.3f, 6);
        System.out.println(beach.compareTo(beach1));
        Beach beach2 = new Beach("beach3", 1.2f, 10);
    }
}
