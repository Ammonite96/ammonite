package ru.JavaRush.JavaCore.LvL15.lec12.SingletonPatternPt2Solution4;

public class Sun implements Planet {
    private static Sun instance;

    private Sun() {
    }

    public static Sun getInstance(){
        if (instance == null)
            instance = new Sun();
        return instance;
    }
}
