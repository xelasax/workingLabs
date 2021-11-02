package io.turntabl.firstAssignment.domain;

import io.turntabl.firstAssignment.exceptions.StudentNotFoundException;
import io.turntabl.firstAssignment.services.Nameable;
import io.turntabl.firstAssignment.utils.Level;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Register {

    private List<? extends Student> students;

    public Register(List<Student> nameableList) {
        this.students = nameableList;
    }

    public Map<Level, List<? extends Student>> getRegisterByLevel(Level level){
        List<? extends Student> students = this.students.stream()
                .filter(student -> student.getLevel().equals(level))
                .toList();

        return Map.of(level,students);
    }

    public List<String> getRegister(){
       return students.stream()
               .map(Nameable::getName)
               .toList();
    }

    public List<? extends Student> sort(Comparator<Student> studentComparator){
        return students.stream()
                .sorted(studentComparator)
                .toList();

    }

    public Student getStudent(String name){
        return students.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student Not Found"));
    }

    public void printReport(){
        students.stream()
                .collect(Collectors.groupingBy(Student::getLevel))
                .forEach((level, students) -> System.out.println(students));
    }

    public OptionalDouble highestGrade(){
       return students.stream()
               .map(Student::studentGrades)
               .flatMapToDouble(doubleStream -> doubleStream)
               .max();
    }

    public OptionalDouble averageStudentGrades(){
        return students.stream()
                .map(Student::studentGrades)
                .flatMapToDouble(doubleStream -> doubleStream)
                .average();
    }

    public List<List<Double>> gradesOfStudentsScoringAbove60(){
        return students.stream()
                .filter(student -> student.getAverageGrade() > 0.6 )
                .map(Student::getGrades)
                .collect(Collectors.toList());
    }
}
