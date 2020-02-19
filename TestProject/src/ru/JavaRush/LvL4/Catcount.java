package TP1JavaRush4lvl;

public class Catcount {
    private static int catsCount = 1;

    public static void addNewCat() {
        Catcount cat = new Catcount();
        ++Catcount.catsCount;
    }

    public static void main(String[] args) {
       System.out.println(catsCount);
    }
}
