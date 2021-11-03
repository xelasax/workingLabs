package io.turntabl.firstAssignment.domain;

import io.turntabl.firstAssignment.exceptions.StudentNotFoundException;
import io.turntabl.firstAssignment.services.Nameable;
import io.turntabl.firstAssignment.utils.Level;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The type Register.
 */
public class Register {

    private List<? extends Student> students;

    /**
     * Instantiates a new Register.
     *
     * @param nameableList the nameable list
     */
    public Register(List<Student> nameableList) {
        this.students = nameableList;
    }

    /**
     * Get register by level map.
     *
     * @param level the level
     * @return the map
     */
    public Map<Level, List<? extends Student>> getRegisterByLevel(Level level){
        List<? extends Student> students = this.students.stream()
                .filter(student -> student.getLevel().equals(level))
                .toList();

        return Map.of(level,students);
    }

    /**
     * Get register list.
     *
     * @return the list
     */
    public List<String> getRegister(){
       return students.stream()
               .map(Nameable::getName)
               .toList();
    }

    /**
     * Sort list.
     *
     * @param studentComparator the student comparator
     * @return the list
     */
    public List<? extends Student> sort(Comparator<Student> studentComparator){
        return students.stream()
                .sorted(studentComparator)
                .toList();

    }

    /**
     * Get student optional.
     *
     * @param name the name
     * @return the optional
     */
    public  Student getStudent(String name){
        return students.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student Not Found"));
    }

    public Optional<? extends Student> getStudentOptional(String name){
        return students.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst();
//                .orElseThrow(() -> new StudentNotFoundException("Student Not Found"));
    }

    /**
     * Get students by name list.
     *
     * @param names the names
     * @return the list
     */
    public List<? extends Student> getStudentsByName(List<String> names){
        return students
                .stream()
                .filter(student -> names.contains(student.getName()))
                .toList();

    }

    /**
     * Print report.
     */
    public void printReport(){
        students.stream()
                .collect(Collectors.groupingBy(Student::getLevel))
                .forEach((level, students) -> System.out.println(students));
    }

    /**
     * Highest grade optional double.
     *
     * @return the optional double
     */
    public OptionalDouble highestGrade(){
       return students.stream()
               .map(Student::studentGrades)
               .flatMapToDouble(doubleStream -> doubleStream)
               .max();
    }

    /**
     * Average student grades optional double.
     *
     * @return the optional double
     */
    public OptionalDouble averageStudentGrades(){
        return students.stream()
                .map(Student::studentGrades)
                .flatMapToDouble(doubleStream -> doubleStream)
                .average();
    }

    /**
     * Grades of students scoring above 60 list.
     *
     * @return the list
     */
    public List<List<Double>> gradesOfStudentsScoringAbove60(){
        return students.stream()
                .filter(student -> student.getAverageGrade() > 0.6 )
                .map(Student::getGrades)
                .collect(Collectors.toList());
    }
}
