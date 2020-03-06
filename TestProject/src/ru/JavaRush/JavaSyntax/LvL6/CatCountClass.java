package ru.JavaRush.LvL6;

/**
 * Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
 * с помощью которых можно получить/изменить количество котов (переменную catCount).
 */

public class CatCountClass {

    private static int catCount = 0;

    public CatCountClass() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        CatCountClass.catCount = catCount;
    }
}
