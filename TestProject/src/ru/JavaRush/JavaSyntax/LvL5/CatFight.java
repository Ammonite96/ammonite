package ru.JavaRush.LvL5;

/**
 * реализовать метод fight()
 */

public class CatFight {
    public int age;
    public int weight;
    public int strength;

    public CatFight() {
    }

    public boolean fight(CatFight anotherCat) {
        //напишите тут ваш код
        int count1 = 0;
        int count2 = 0;

        if (this.age > anotherCat.age)
            count1++;
        else if (this.age != anotherCat.age)
            count2++;
        if (this.weight > anotherCat.weight)
            count1++;
        else if (this.weight != anotherCat.weight)
            count2++;
        if (this.strength > anotherCat.strength)
            count1++;
        else if (this.strength != anotherCat.strength)
            count2++;

        if (count1 == count2)
            return false;

        if (count1 > count2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        CatFight cat1 = new CatFight();
        cat1.strength = 100;
        cat1.age = 5;
        cat1.weight = 7;

        CatFight cat2 = new CatFight();
        cat2.strength = 100;
        cat2.age = 5;
        cat2.weight = 6;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));


    }
}

