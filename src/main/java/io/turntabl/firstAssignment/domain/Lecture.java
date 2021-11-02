package io.turntabl.firstAssignment.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Lecture {

    private Lecturer lecturer;
    private  List<Student> students = new ArrayList<>();

    public Lecture(List<Student> students) {
        this.students = students;
    }

    public Lecture(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Lecture(Lecturer lecturer, List<Student> students) {
        this.lecturer = lecturer;
        this.students = students;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Lecture() {
        students = new ArrayList<>();
    }

    public void enter(Student student){
       students.add(student);
    }

    public OptionalDouble getHighestAverageGrade(){
        return students
                .stream()
                .mapToDouble(Student::getAverageGrade)
                .max();
    }

    public List<Student> getStudents() {
        return students;
    }
}
