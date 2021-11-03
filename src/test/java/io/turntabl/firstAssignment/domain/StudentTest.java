package io.turntabl.firstAssignment.domain;

import io.turntabl.firstAssignment.utils.Level;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {
        Student one = new Student("studentID", "Alexander Koomson", Level.FIRST_YEAR, List.of(1.0,2.0,3.0));

        Assertions.assertEquals(2,one.getAverageGrade());
    }
}