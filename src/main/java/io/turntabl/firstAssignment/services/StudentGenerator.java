package io.turntabl.firstAssignment.services;

import io.turntabl.firstAssignment.domain.NaughtyStudent;
import io.turntabl.firstAssignment.domain.Student;
import io.turntabl.firstAssignment.utils.StudentYear;

import javax.xml.stream.events.StartDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentGenerator {
    public static List<Student> generateStudents(){
        return List.of(
        new Student(generateUniqueID(),"Johnson Appiah", StudentYear.FIRST_YEAR),
        new Student(generateUniqueID(),"Johnson Elizabeth", StudentYear.SECOND_YEAR),
        new Student(generateUniqueID(),"Cynthia Appiah", StudentYear.THIRD_YEAR),
        new Student(generateUniqueID(),"Faith Appiah", StudentYear.FOURTH_YEAR),
        new Student(generateUniqueID(),"Anima Amoako", StudentYear.FOURTH_YEAR),
        new Student(generateUniqueID(),"Ohemaa Amoako", StudentYear.THIRD_YEAR),
        new Student(generateUniqueID(),"Nana Yaw Appiah", StudentYear.THIRD_YEAR),
        new Student(generateUniqueID(),"Oheneba Quayson", StudentYear.SECOND_YEAR),
        new Student(generateUniqueID(),"Ola Makinde", StudentYear.FIRST_YEAR),
        new Student(generateUniqueID(),"Fasugba Maria", StudentYear.SECOND_YEAR),
        new Student(generateUniqueID(),"Fasugba Maria", StudentYear.THIRD_YEAR),
        new Student(generateUniqueID(),"Oluwafikema Jones", StudentYear.FOURTH_YEAR)
       );
    }

    public static List<NaughtyStudent> generateNaughtyStudents(){
        return List.of(
                new NaughtyStudent(generateUniqueID(),"Raymond", StudentYear.THIRD_YEAR),
                new NaughtyStudent(generateUniqueID(),"Dickson", StudentYear.SECOND_YEAR),
                new NaughtyStudent(generateUniqueID(),"Mary", StudentYear.FIRST_YEAR),
                new NaughtyStudent(generateUniqueID(),"Pentsil", StudentYear.SECOND_YEAR),
                new NaughtyStudent(generateUniqueID(),"Zenab", StudentYear.THIRD_YEAR),
                new NaughtyStudent(generateUniqueID(),"Zander", StudentYear.FOURTH_YEAR)
        );
    }



    private static String generateUniqueID(){
        return UUID.randomUUID().toString();
    }
}
