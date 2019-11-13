package io.zipcoder.interfaces.classes;

import io.zipcoder.interfaces.interfaces.Learner;
import io.zipcoder.interfaces.interfaces.Teacher;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name){
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner s: learners){
            s.learn(numberOfHours/learners.length);
        }
    }
}
