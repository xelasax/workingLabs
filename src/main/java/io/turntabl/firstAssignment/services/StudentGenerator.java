package io.turntabl.firstAssignment.services;

import io.turntabl.firstAssignment.domain.Student;
import io.turntabl.firstAssignment.utils.StudentYear;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentGenerator {
    public static List<Student> generateStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(generateUniqueID(),"Johnson Appiah", StudentYear.FIRST_YEAR));
        studentList.add(new Student(generateUniqueID(),"Johnson Elizabeth", StudentYear.SECOND_YEAR));
        studentList.add(new Student(generateUniqueID(),"Cynthia Appiah", StudentYear.THIRD_YEAR));
        studentList.add(new Student(generateUniqueID(),"Faith Appiah", StudentYear.FOURTH_YEAR));
        studentList.add(new Student(generateUniqueID(),"Anima Amoako", StudentYear.FOURTH_YEAR));
        studentList.add(new Student(generateUniqueID(),"Ohemaa Amoako", StudentYear.THIRD_YEAR));
        studentList.add(new Student(generateUniqueID(),"Nana Yaw Appiah", StudentYear.THIRD_YEAR));
        studentList.add(new Student(generateUniqueID(),"Oheneba Quayson", StudentYear.SECOND_YEAR));
        studentList.add(new Student(generateUniqueID(),"Ola Makinde", StudentYear.FIRST_YEAR));
        studentList.add(new Student(generateUniqueID(),"Fasugba Maria", StudentYear.SECOND_YEAR));
        studentList.add(new Student(generateUniqueID(),"Fasugba Maria", StudentYear.THIRD_YEAR));
        studentList.add(new Student(generateUniqueID(),"Oluwafikema Jones", StudentYear.FOURTH_YEAR));

        return studentList;
    }

    private static String generateUniqueID(){
        return UUID.randomUUID().toString();
    }
}
