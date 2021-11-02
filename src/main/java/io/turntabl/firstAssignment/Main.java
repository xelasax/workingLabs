package io.turntabl.firstAssignment;

import io.turntabl.firstAssignment.domain.Course;
import io.turntabl.firstAssignment.domain.Student;
import io.turntabl.firstAssignment.services.StudentGenerator;
import io.turntabl.firstAssignment.utils.Level;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Course introToProgramming = new Course(Level.FIRST_YEAR, Course.CourseType.PROGRAMMING);

        List<Student> firstYearStudents = StudentGenerator.generateStudents()
                        .stream()
                        .filter(student -> student.getStudentYear()
                                .equals(introToProgramming.getCourseYear())
                        )
                        .collect(Collectors.toList());

        introToProgramming.setStudents(firstYearStudents);
        System.out.println("======================================================");
        System.out.println("=====      INTRO TO PROGRAMMING COURSE            ====");
        System.out.println("======================================================");
        System.out.println(introToProgramming);


        Course advancedGardeningCourse = new Course(Level.FOURTH_YEAR, Course.CourseType.GARDENING);

        List<Student> thirdAndFourthYearStudents = StudentGenerator.generateStudents().stream()
                .filter(student -> student.getStudentYear().equals(Level.FOURTH_YEAR) || student.getStudentYear().equals(Level.THIRD_YEAR))
                .collect(Collectors.toList());

        advancedGardeningCourse.setStudents(thirdAndFourthYearStudents);
        System.out.println("======================================================");
        System.out.println("=====        ADVANCED GARDENING COURSE            ====");
        System.out.println("======================================================");
        System.out.println(advancedGardeningCourse);

        Course physicsCourse = new Course(Level.FOURTH_YEAR, Course.CourseType.PHYSICS);

        List<Student> physicsFourthYearStudents = StudentGenerator.generateStudents().stream()
                .filter(student -> student.getStudentYear().equals(physicsCourse.getCourseYear()))
                .filter(student -> "aeiou".contains(student.getName().substring(0,1).toLowerCase()))
                .toList();

        System.out.println("======================================================");
        System.out.println("=====        PHYSICS GARDENING COURSE            ====");
        System.out.println("======================================================");
        System.out.println(physicsFourthYearStudents);


    }








}
