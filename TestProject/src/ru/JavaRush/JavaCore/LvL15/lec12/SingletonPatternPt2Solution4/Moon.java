package ru.JavaRush.JavaCore.LvL15.lec12.SingletonPatternPt2Solution4;

public class Moon implements Planet {
    private static Moon instance;

    private Moon() {
    }

    public static Moon getInstance(){
        if (instance == null)
            instance = new Moon();
        return instance;
    }
}
