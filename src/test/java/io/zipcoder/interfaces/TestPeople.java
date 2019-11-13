package io.zipcoder.interfaces;

import io.zipcoder.interfaces.classes.People;
import io.zipcoder.interfaces.classes.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {

    People people;
    Person person1;
    Person person2;
    Person person3;

    @Before
    public void doThisFirst(){
        people = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        person1 = new Person(1, "Jack");
        person2 = new Person(2, "Daniels");
        person3 = new Person(3, "Whiskey");

        people.add(person1);
        people.add(person2);
        people.add(person3);
        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));
        Assert.assertTrue(people.contains(person3));
    }

    @Test
    public void testAdd(){
        Person person4 = new Person(4, "");
        people.add(person4);
        Assert.assertTrue(people.contains(person4));
    }

    @Test
    public void testRemove(){
        Assert.assertTrue(people.remove(person3));
        Person person4 = new Person(4, "");
        Assert.assertFalse(people.remove(person4));
    }

    @Test
    public void testFindById(){
        Person testPerson = people.findById(3);
        Assert.assertSame(person3, testPerson);
    }

}
