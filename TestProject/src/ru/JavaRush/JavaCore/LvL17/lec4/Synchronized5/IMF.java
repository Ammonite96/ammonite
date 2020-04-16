package ru.JavaRush.JavaCore.LvL17.lec4.Synchronized5;

/**
 * /**
 *  * Singleton паттерн - синхронизация в методе.
 *  * Класс IMF - это Международный Валютный Фонд.
 *  * Внутри метода getFund создайте синхронизированный блок.
 *  * Внутри синхронизированного блока инициализируйте поле imf так, чтобы метод getFund всегда возвращал один и тот же объект.
 *  */


public class IMF {
    private static IMF imf;

    public static IMF getFund() {
        IMF localImf = imf;
       if (localImf == null){
           synchronized (IMF.class){
               localImf = imf;
               if (localImf == null)
                   localImf = imf = new IMF();
           }
       }
       return localImf;
    }

    private IMF() {
    }
}
