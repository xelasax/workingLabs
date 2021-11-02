package io.turntabl.firstAssignment.domain;

import io.turntabl.firstAssignment.utils.StudentYear;

import java.util.List;
import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private StudentYear studentYear;
    private List<Double> grades;

    public Student(String id, String name, StudentYear studentYear) {
        this.id = id;
        this.name = name;
        this.studentYear = studentYear;
    }

    public Student(String id, String name, StudentYear studentYear, List<Double> grades) {
        this.id = id;
        this.name = name;
        this.studentYear = studentYear;
        this.grades = grades;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public StudentYear getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(StudentYear studentYear) {
        this.studentYear = studentYear;
    }

    public double getAverageGrade(){
        return grades.stream().mapToDouble(mark -> mark).average().orElse(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", studentYear=" + studentYear +
                '}';
    }
}
