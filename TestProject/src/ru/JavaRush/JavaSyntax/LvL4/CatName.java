package TP1JavaRush4lvl;

public class CatName {
    String name = "бузымянный кот";

    public void setName(String name) {
        this.name = name;

    }

    public static void main(String[] args) {
        CatName cat = new CatName();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
