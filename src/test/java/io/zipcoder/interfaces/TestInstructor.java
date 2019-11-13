package io.zipcoder.interfaces;

import io.zipcoder.interfaces.classes.Instructor;
import io.zipcoder.interfaces.classes.Person;
import io.zipcoder.interfaces.classes.Student;
import io.zipcoder.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {

    Instructor instructor;
    Student newStudent ;
    Student newStudent1;
    Student newStudent2;

    @Before
    public void doThisFirst(){
        instructor = new Instructor(1, "Kris");
        newStudent = new Student(1, "Mike");
        newStudent1 = new Student(1, "Mike");
        newStudent2 = new Student(1, "Mike");
    }


    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }



    @Test
    public void testTeach(){
        instructor.teach(newStudent, 10);
        Assert.assertEquals(10, newStudent.getTotalStudyTime(), 0.0);
        instructor.teach(newStudent, 10);
        Assert.assertEquals(20, newStudent.getTotalStudyTime(), 0.0);
    }

    @Test
    public void testLecture(){
        Student[] students = {newStudent, newStudent1, newStudent2};
        instructor.lecture(students, 9);
        Assert.assertEquals(3, newStudent.getTotalStudyTime(), 0.0);
        Assert.assertEquals(3, newStudent1.getTotalStudyTime(), 0.0);
        Assert.assertEquals(3, newStudent2.getTotalStudyTime(), 0.0);
        instructor.lecture(students, 9);
        Assert.assertEquals(6, newStudent.getTotalStudyTime(), 0.0);
        Assert.assertEquals(6, newStudent1.getTotalStudyTime(), 0.0);
        Assert.assertEquals(6, newStudent2.getTotalStudyTime(), 0.0);
    }
}
