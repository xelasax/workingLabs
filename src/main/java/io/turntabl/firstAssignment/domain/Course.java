package io.turntabl.firstAssignment.domain;

import io.turntabl.firstAssignment.utils.StudentYear;

import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> students;
    private StudentYear courseYear;

    public Course(StudentYear courseYear) {
        this.courseYear = courseYear;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public StudentYear getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(StudentYear courseYear) {
        this.courseYear = courseYear;
    }

    @Override
    public String toString() {
        return "Course{" +
                "lecturer=" + lecturer +
                ", students=" + students +
                ", courseYear=" + courseYear +
                '}';
    }
}
