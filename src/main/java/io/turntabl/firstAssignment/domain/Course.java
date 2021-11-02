package io.turntabl.firstAssignment.domain;

import io.turntabl.firstAssignment.utils.Level;

import java.util.List;

public class Course {
    private final CourseType courseType;
    private Lecturer lecturer;
    private List<Student> students;
    private Level courseYear;

    public Course(Level courseYear, CourseType courseType) {
        this.courseYear = courseYear;
        this.courseType = courseType;
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

    public Level getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(Level courseYear) {
        this.courseYear = courseYear;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "Course{" +
                "lecturer=" + lecturer +
                ", students=" + students +
                ", courseYear=" + courseYear +
                '}';
    }

    public enum CourseType{
        ENGLISH_LANGUAGE, MATH, PHYSICS, PROGRAMMING, GARDENING
    }
}
