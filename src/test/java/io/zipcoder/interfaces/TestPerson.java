package io.zipcoder.interfaces;

import io.zipcoder.interfaces.classes.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest(){

        long expectedId = 6;
        String expectedName = "NotAName";


        Person testPerson = new Person(expectedId, expectedName);
        Assert.assertEquals(expectedId, testPerson.getId());
        Assert.assertEquals(expectedName, testPerson.getName());
    }

    @Test
    public void setNameTest(){

        String expectedName = "NotAName";
        Person testPerson = new Person(6, expectedName);
        testPerson.setName("AName");
        Assert.assertEquals("AName", testPerson.getName());
    }
}
