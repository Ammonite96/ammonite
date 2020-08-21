package ru.JavaRush.JavaMultithreading.LvL25.lec16.Refactoring.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;
    private String name;
    private int age;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        Student studentAverageGrade = null;
        for (Student student : getStudents()) {
            if (student.getAverageGrade() == averageGrade) {
                studentAverageGrade = student;
                break;
            }
        }
        return studentAverageGrade;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        double max = 0.0;
        Student studentAverageGradeMax = null;
        for (Student student : getStudents()) {
            if (student.getAverageGrade() >= max) {
                max = student.getAverageGrade();
                studentAverageGradeMax = student;

            }
        }
        return studentAverageGradeMax;
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        double min = 100.0;
        Student studentAverageGradeMin = null;
        for (Student student : getStudents()) {
            if (student.getAverageGrade() <= min) {
                min = student.getAverageGrade();
                studentAverageGradeMin = student;

            }
        }
        return studentAverageGradeMin;
    }

    public void expel(Student student){
        students.remove(student);
    }
}
