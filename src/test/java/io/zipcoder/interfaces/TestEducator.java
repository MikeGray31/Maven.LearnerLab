package io.zipcoder.interfaces;

import io.zipcoder.interfaces.classes.Student;
import io.zipcoder.interfaces.classes.Students;
import io.zipcoder.interfaces.enums.Educator;
import io.zipcoder.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEducator {
    Educator educator1;
    Educator educator2;
    Educator educator3;
    Students students;


    @Before
    public void doThisFirst(){
        educator1 = Educator.JACK;
        educator2 = Educator.DANIELS;
        educator3 = Educator.WHISKEY;
    }

    @Test
    public void TestImplementation(){
        Assert.assertTrue(educator1 instanceof Teacher);
        Assert.assertTrue(educator2 instanceof Teacher);
        Assert.assertTrue(educator3 instanceof Teacher);
    }

    @Test
    public void TestTeach(){
        educator1.teach(students.getInstance().findById(1), 5);
        educator2.teach(students.getInstance().findById(1),5);
        Assert.assertEquals( 5, educator1.getTimeWorked());
        Assert.assertEquals( 5, educator2.getTimeWorked());
        Assert.assertEquals( 10, students.getInstance().findById(1).getTotalStudyTime(),0.0);


    }

    @Test
    public void TestLecture(){
        educator3.lecture(students.getInstance().toArray(), 9);
        Assert.assertEquals( 9, educator3.getTimeWorked());
        Assert.assertEquals( 3, students.getInstance().findById(2).getTotalStudyTime(),0.0);
        Assert.assertEquals( 3, students.getInstance().findById(3).getTotalStudyTime(),0.0);
    }
}
