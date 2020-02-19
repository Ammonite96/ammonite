package ru.JavaRush.LvL5;

/**
 * Создать три кота используя класс Cat.
 * Провести три боя попарно между котами.
 * Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
 * Результат каждого боя вывести на экран c новой строки.
 */
public class CatFightThree {
    protected String name;
    protected int age;
    protected int weight;
    protected int strength;

    public CatFightThree(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(CatFightThree anotherCat) {
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0; // return score > 0 ? true : false;
    }

    public static void main(String[] args) {
        CatFightThree cat1 = new CatFightThree("Марсик", 5, 8, 100);
        CatFightThree cat2 = new CatFightThree("Оскар", 2, 4, 65);
        CatFightThree cat3 = new CatFightThree("Кекс", 5, 6, 75);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }
}

