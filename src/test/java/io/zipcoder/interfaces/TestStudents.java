package io.zipcoder.interfaces;

import io.zipcoder.interfaces.classes.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    Students students;

    @Test
    public void testContains(){
        Assert.assertTrue(students.getInstance().contains(students.getInstance().findById(1)));
        Assert.assertTrue(students.getInstance().contains(students.getInstance().findById(2)));
        Assert.assertTrue(students.getInstance().contains(students.getInstance().findById(3)));
    }



}
