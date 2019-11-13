package io.zipcoder.interfaces;

import io.zipcoder.interfaces.classes.Student;
import io.zipcoder.interfaces.classes.Students;
import io.zipcoder.interfaces.classes.ZipCodeWilmington;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    ZipCodeWilmington zipCodeWilmington;

    @Before
    public void doThisFirst(){
    }

    @Test
    public void testHostLecture() {
        zipCodeWilmington.getInstance().hostLecture(100, 9);

        for (Student s : Students.getInstance().toArray()) {
            Assert.assertEquals(3, s.getTotalStudyTime(), 0.0);
        }
    }
}
