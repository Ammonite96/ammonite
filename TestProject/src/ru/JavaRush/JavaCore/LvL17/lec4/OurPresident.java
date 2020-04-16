package ru.JavaRush.JavaCore.LvL17.lec4;

/**
 * И снова Singleton паттерн - синхронизация в статическом блоке.
 * Внутри класса OurPresident в статическом блоке создайте синхронизированный блок.
 * Внутри синхронизированного блока инициализируйте president.
 */

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }


    public static OurPresident getOurPresident() {
        return president;
    }

    static {
        synchronized (OurPresident.class){
            president = new OurPresident();
        }
    }

}

