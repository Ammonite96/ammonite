package ru.JavaRush.JavaCore.LvL14.lec8.Wines;

/**
 * 1. Создать абстрактный класс Drink с реализованным методом public void taste(), который выводит в консоль "Вкусно".
 * 2. Создать класс Wine, который наследуется от Drink, с реализованным методом public String getHolidayName(), который возвращает строку "День Рождения".
 * 3. Создать класс BubblyWine, который наследуется от Wine, с реализованным методом public String getHolidayName(), который возвращает строку "Новый Год".
 * 4. Написать реализацию методов getDeliciousDrink, getWine, getBubblyWine.
 * 5. Все классы должны находиться в отдельных файлах.
 */

public class MainClassWine {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        Wine wine = new Wine();
        return wine;
    }

    public static Wine getWine() {
        Wine wine = new Wine();
        return wine;
    }

    public static Wine getBubblyWine() {
        BubblyWine wine = new BubblyWine();
        return wine;
    }
}
