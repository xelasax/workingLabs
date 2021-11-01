package io.turntabl.firstAssignment;

import io.turntabl.firstAssignment.domain.AdvancedGardeningCourse;
import io.turntabl.firstAssignment.domain.Course;
import io.turntabl.firstAssignment.domain.PhysicsCourse;
import io.turntabl.firstAssignment.domain.Student;
import io.turntabl.firstAssignment.services.StudentGenerator;
import io.turntabl.firstAssignment.utils.StudentYear;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Course introToProgramming = new Course(StudentYear.FIRST_YEAR);

        List<Student> firstYearStudents = StudentGenerator.generateStudents()
                        .stream()
                        .filter(student -> student.getStudentYear().equals(introToProgramming.getCourseYear()))
                        .collect(Collectors.toList());

        introToProgramming.setStudents(firstYearStudents);
        System.out.println("======================================================");
        System.out.println("=====      INTRO TO PROGRAMMING COURSE            ====");
        System.out.println("======================================================");
        System.out.println(introToProgramming);


        AdvancedGardeningCourse advancedGardeningCourse = new AdvancedGardeningCourse();

        List<Student> thirdAndFourthYearStudents = StudentGenerator.generateStudents().stream()
                .filter(student -> student.getStudentYear().equals(StudentYear.FOURTH_YEAR) || student.getStudentYear().equals(StudentYear.THIRD_YEAR))
                .collect(Collectors.toList());

        advancedGardeningCourse.setStudents(thirdAndFourthYearStudents);
        System.out.println("======================================================");
        System.out.println("=====        ADVANCED GARDENING COURSE            ====");
        System.out.println("======================================================");
        System.out.println(advancedGardeningCourse);

        PhysicsCourse physicsCourse = new PhysicsCourse();
        String vowels = "aeiou";
        List<Student> physicsFourthYearStudents = StudentGenerator.generateStudents().stream()

                .filter(student -> student.getStudentYear().equals(physicsCourse.getCourseYear()))
                .filter(student -> vowels.contains(student.getName().toLowerCase().substring(0,1)))
                .collect(Collectors.toList());

        System.out.println("======================================================");
        System.out.println("=====        PHYSICS GARDENING COURSE            ====");
        System.out.println("======================================================");
        System.out.println(physicsFourthYearStudents);


    }








}
