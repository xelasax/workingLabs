package io.turntabl.firstAssignment;

import io.turntabl.firstAssignment.domain.Student;

import java.util.LinkedList;
import java.util.List;

public class BagOfStudent {

   private List<Student> bagOfStudents = new LinkedList<>();

    public void add(Student student){
        bagOfStudents.add(student);
    }
    public void remove(Student student){
        bagOfStudents.remove(student);
    }
}
