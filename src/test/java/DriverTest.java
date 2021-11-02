import io.turntabl.firstAssignment.Bag;
import io.turntabl.firstAssignment.domain.*;
import io.turntabl.firstAssignment.utils.Level;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DriverTest {
    Student student;
    Student student2;
    @BeforeEach
    void setUp(){
        student = new NaughtyStudent("12123123","Alexander", Level.FOURTH_YEAR,List.of(1.1,1.2,1.1,1.0));
        student2 = new Student("12123173","John", Level.FOURTH_YEAR,List.of(1.1,1.2,1.1,1.0));

    }

    @Test
    @DisplayName("Naughty Student is a kind of Student")
    void testNaughtyStudentIsAKindOfStudent(){
//        Assertions.assertTrue();

    }
    @Test
    @DisplayName("Verifying Naughty Student Scores Higher Average grade than Regular Student with Same grades")
    void testUpOnIt(){

        Lecture lecture = new Lecture(List.of(student,student2));
        Assertions.assertEquals(2, lecture.getStudents().size());
        Assertions.assertEquals("Alexander", lecture.getStudents().get(0).getName());
        Assertions.assertEquals("John", lecture.getStudents().get(1).getName());
        Assertions.assertTrue(lecture.getStudents().get(0).getAverageGrade() > lecture.getStudents().get(1).getAverageGrade());

    }

    @Test
    @DisplayName("Add Elements To Bag Of Students")
    void addStudentsToBag(){
        Bag<Student> students = new Bag<>();
        students.add(student);
        students.add(student2);
        Assertions.assertEquals(2, students.getBag().size());
    }

    @Test
    @DisplayName("Remove Elements To Bag Of Students")
    void removeStudentsToBag(){
        Bag<Student> studentBag = new Bag<>();
        studentBag.add(student);
        studentBag.add(student2);
        Assertions.assertEquals(2, studentBag.getBag().size());

        studentBag.remove(student);
        Assertions.assertEquals(1, studentBag.getBag().size());
        Assertions.assertEquals("John", studentBag.getBag().get(0).getName());

    }

    @Test
    @DisplayName("Using Bag for Students")
    void clearStudentsToBag(){
        Bag<Student> studentBag = new Bag<>();
        studentBag.add(student);
        studentBag.add(student2);
        Assertions.assertEquals(2, studentBag.getBag().size());

        studentBag.clear();
        Assertions.assertEquals(0,studentBag.getBag().size());

    }

    @Test
    @DisplayName("Using Bag for lecturers")
    void addLecturerToBag(){
        Bag<Lecturer> lecturerBag = new Bag<>();
        lecturerBag.add(new Lecturer("Denis", new Course(Level.FOURTH_YEAR, Course.CourseType.PROGRAMMING)));
        lecturerBag.add(new Lecturer("Denis", new Course(Level.FOURTH_YEAR, Course.CourseType.PROGRAMMING)));
        lecturerBag.add(new Lecturer("Denis", new Course(Level.FOURTH_YEAR, Course.CourseType.PROGRAMMING)));

        Assertions.assertEquals(3, lecturerBag.getBag().size());


    }


}
