package io.turntabl.firstAssignment.domain;

import io.turntabl.firstAssignment.utils.Level;

import java.util.List;


public class NaughtyStudent extends Student{

    public NaughtyStudent(String id, String name, Level studentYear) {
        super(id, name, studentYear);
    }

    public NaughtyStudent(String id, String name, Level studentYear, List<Double> grades) {
        super(id, name, studentYear, grades);
    }

    @Override
    public double getAverageGrade() {
        return   super.getAverageGrade() + (0.1 *  super.getAverageGrade());
    }
}
