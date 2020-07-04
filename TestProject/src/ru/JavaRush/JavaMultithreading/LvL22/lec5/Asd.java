package ru.JavaRush.JavaMultithreading.LvL22.lec5;

public class Asd {
    private static String sol = "Амиго и Диего лучшие";

    public static String getStringPars() {
        String[] splitString = sol.split(" ");
        //System.out.println(Arrays.toString(splitString));
        String result = splitString[1] + " " + splitString[2] + " " + splitString[3] + " " + splitString[4];

        return result;
    }

    public static void main(String[] args) {
        //System.out.println("\tJavaRush - лучший сервис \tобучения Java\t.");
        System.out.println(getStringPars());
    }
}
