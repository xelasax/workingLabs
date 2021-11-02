package io.turntabl.firstAssignment.services;

import io.turntabl.firstAssignment.domain.NaughtyStudent;
import io.turntabl.firstAssignment.domain.Student;
import io.turntabl.firstAssignment.utils.Level;

import java.util.List;
import java.util.UUID;

public class StudentGenerator {
    public static List<Student> generateStudents(){
        return List.of(
        new Student(generateUniqueID(),"Johnson Appiah", Level.FIRST_YEAR),
        new Student(generateUniqueID(),"Johnson Elizabeth", Level.SECOND_YEAR),
        new Student(generateUniqueID(),"Cynthia Appiah", Level.THIRD_YEAR),
        new Student(generateUniqueID(),"Faith Appiah", Level.FOURTH_YEAR),
        new Student(generateUniqueID(),"Anima Amoako", Level.FOURTH_YEAR),
        new Student(generateUniqueID(),"Ohemaa Amoako", Level.THIRD_YEAR),
        new Student(generateUniqueID(),"Nana Yaw Appiah", Level.THIRD_YEAR),
        new Student(generateUniqueID(),"Oheneba Quayson", Level.SECOND_YEAR),
        new Student(generateUniqueID(),"Ola Makinde", Level.FIRST_YEAR),
        new Student(generateUniqueID(),"Fasugba Maria", Level.SECOND_YEAR),
        new Student(generateUniqueID(),"Fasugba Maria", Level.THIRD_YEAR),
        new Student(generateUniqueID(),"Oluwafikema Jones", Level.FOURTH_YEAR)
       );
    }

    public static List<NaughtyStudent> generateNaughtyStudents(){
        return List.of(
                new NaughtyStudent(generateUniqueID(),"Raymond", Level.THIRD_YEAR),
                new NaughtyStudent(generateUniqueID(),"Dickson", Level.SECOND_YEAR),
                new NaughtyStudent(generateUniqueID(),"Mary", Level.FIRST_YEAR),
                new NaughtyStudent(generateUniqueID(),"Pentsil", Level.SECOND_YEAR),
                new NaughtyStudent(generateUniqueID(),"Zenab", Level.THIRD_YEAR),
                new NaughtyStudent(generateUniqueID(),"Zander", Level.FOURTH_YEAR)
        );
    }



    private static String generateUniqueID(){
        return UUID.randomUUID().toString();
    }
}
