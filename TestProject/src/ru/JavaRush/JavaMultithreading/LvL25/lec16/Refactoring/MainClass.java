package ru.JavaRush.JavaMultithreading.LvL25.lec16.Refactoring;

import ru.JavaRush.JavaMultithreading.LvL25.lec16.Refactoring.human.Student;
import ru.JavaRush.JavaMultithreading.LvL25.lec16.Refactoring.human.University;

public class MainClass {
    public static void main(String[] args) {
        Student student = new Student("VAsya", 18, 25.1);
        Student student1 = new Student("Oleg", 20, 24.2);
        University university = new University("YRFY", 100);

        System.out.println(university.getStudentWithAverageGrade(25.1));
        System.out.println(student.toString());
    }
}
