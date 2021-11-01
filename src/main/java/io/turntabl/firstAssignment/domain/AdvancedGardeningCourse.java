package io.turntabl.firstAssignment.domain;

import io.turntabl.firstAssignment.utils.StudentYear;

public class AdvancedGardeningCourse extends Course{

    public AdvancedGardeningCourse() {
        this(StudentYear.FOURTH_YEAR);
    }

    private AdvancedGardeningCourse(StudentYear courseYear) {
        super(courseYear);
    }
}
