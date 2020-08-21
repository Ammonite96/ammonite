package ru.JavaRush.JavaMultithreading.LvL25.lec16.Refactoring.human;

public class Soldier extends Human implements Alive {
    public Soldier(String name, int age) {
        super(name, age);
    }

    public void live() {
        fight();
    }

    public void fight() {
    }
}
