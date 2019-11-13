package io.zipcoder.interfaces;

import io.zipcoder.interfaces.classes.Student;
import io.zipcoder.interfaces.classes.Students;
import io.zipcoder.interfaces.classes.ZipCodeWilmington;
import io.zipcoder.interfaces.enums.Educator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ZipCodeWilmingtonTest {

    ZipCodeWilmington zipCodeWilmington;
    Educator educator;

    @Before
    public void doThisFirst(){
         educator = Educator.JACK;
    }

    @Test
    public void testHostLecture() {
        zipCodeWilmington.getInstance().hostLecture(100, 9);

        for (Student s : Students.getInstance().toArray()) {
            Assert.assertEquals(3, s.getTotalStudyTime(), 0.0);
        }
    }

    @Test
    public void testEducatorHostLecture() {
        zipCodeWilmington.getInstance().hostLecture(educator, 9);

        for (Student s : Students.getInstance().toArray()) {
            Assert.assertEquals(3, s.getTotalStudyTime(), 0.0);
        }
    }
}
