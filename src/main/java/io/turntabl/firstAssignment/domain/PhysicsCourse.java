package io.turntabl.firstAssignment.domain;

import io.turntabl.firstAssignment.utils.StudentYear;

public class PhysicsCourse extends Course{

    public PhysicsCourse() {
        this(StudentYear.FOURTH_YEAR);
    }

    public PhysicsCourse(StudentYear courseYear) {
        super(courseYear);
    }
}
