package io.zipcoder.interfaces;

import io.zipcoder.interfaces.classes.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    Instructors instructors;

    @Test
    public void testContains(){
        Assert.assertTrue(instructors.getInstance().contains(instructors.getInstance().findById(100)));
        Assert.assertTrue(instructors.getInstance().contains(instructors.getInstance().findById(200)));
        Assert.assertTrue(instructors.getInstance().contains(instructors.getInstance().findById(300)));
    }
}
