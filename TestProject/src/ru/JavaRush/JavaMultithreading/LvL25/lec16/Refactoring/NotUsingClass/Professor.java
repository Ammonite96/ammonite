package ru.JavaRush.JavaMultithreading.LvL25.lec16.Refactoring.NotUsingClass;

import ru.JavaRush.JavaMultithreading.LvL25.lec16.Refactoring.human.Teacher;

public class Professor extends Teacher {
    Professor(String name, int age, int numberOfStudents) {
        super(name, age, numberOfStudents);
    }

    public void live() {
        teach();
    }

}

