package io.zipcoder.interfaces;

import io.zipcoder.interfaces.classes.Person;
import io.zipcoder.interfaces.classes.Student;
import io.zipcoder.interfaces.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){

        Student newStudent = new Student(1, "Mike");
        Assert.assertTrue(newStudent instanceof Learner);
    }

    @Test
    public void testInheritance(){

        Student newStudent = new Student(1, "Mike");
        Assert.assertTrue(newStudent instanceof Person);
    }

    @Test
    public void testLearn(){

        Student newStudent = new Student(1, "Mike");
        Assert.assertEquals(0, newStudent.getTotalStudyTime(), 0.0);
        newStudent.learn(5);
        Assert.assertEquals(5, newStudent.getTotalStudyTime(), 0.0);
        newStudent.learn(5);
        Assert.assertEquals(10, newStudent.getTotalStudyTime(), 0.0);


    }
}
