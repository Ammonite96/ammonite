package ru.JavaRush.JavaCore.LvL12.lec9;

/**
 * Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
 * Добавить в каждый интерфейс по одному методу.
 */

public interface InterfaceFlyRunSwim {
    public interface CanFly{
        public void fly();
    }

    public interface CanRun{
        public void run();
    }

    public interface CanSwim{
        public void swim();
    }
}


