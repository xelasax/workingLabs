package io.turntabl.firstAssignment.domain;

import io.turntabl.firstAssignment.utils.StudentYear;

import java.util.List;


public class NaughtyStudent extends Student{

    public NaughtyStudent(String id, String name, StudentYear studentYear) {
        super(id, name, studentYear);
    }

    public NaughtyStudent(String id, String name, StudentYear studentYear, List<Double> grades) {
        super(id, name, studentYear, grades);
    }

    @Override
    public double getAverageGrade() {
        return   super.getAverageGrade() + (0.1 *  super.getAverageGrade());
    }
}
