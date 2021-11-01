package io.turntabl.firstAssignment.domain;

public class Lecturer {
    private String name;
    private Course course;

    public Lecturer(String name, Course lecturerCourse) {
        this.name = name;
        this.course = lecturerCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getLecturerCourse() {
        return course;
    }

    public void setLecturerCourse(Course lecturerCourse) {
        this.course = lecturerCourse;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", lecturerCourse=" + course +
                '}';
    }
}
