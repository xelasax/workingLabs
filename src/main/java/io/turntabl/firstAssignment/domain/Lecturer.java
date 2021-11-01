package io.turntabl.firstAssignment.domain;

import io.turntabl.firstAssignment.utils.UniversityCourses;

public class Lecturer {
    private String name;
    private UniversityCourses lecturerCourse;

    public Lecturer(String name, UniversityCourses lecturerCourse) {
        this.name = name;
        this.lecturerCourse = lecturerCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UniversityCourses getLecturerCourse() {
        return lecturerCourse;
    }

    public void setLecturerCourse(UniversityCourses lecturerCourse) {
        this.lecturerCourse = lecturerCourse;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", lecturerCourse=" + lecturerCourse +
                '}';
    }
}
