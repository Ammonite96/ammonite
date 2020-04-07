package ru.JavaRush.JavaCore.LvL16;

public class MainClassSleep {
    private static int count;

    public static void main(String[] args) throws InterruptedException {
        while (count != 10){
            Thread.sleep(500);
            System.out.println("Tic");
            count++;
        }
    }
}
