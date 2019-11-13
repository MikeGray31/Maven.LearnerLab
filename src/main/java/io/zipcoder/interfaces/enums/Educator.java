package io.zipcoder.interfaces.enums;

import io.zipcoder.interfaces.classes.Instructor;
import io.zipcoder.interfaces.classes.Instructors;
import io.zipcoder.interfaces.interfaces.Learner;
import io.zipcoder.interfaces.interfaces.Teacher;

public enum Educator implements Teacher{

    JACK (400, "Jack"),
    DANIELS (500, "Daniels"),
    WHISKEY (600, "Whiskey");

    private final Instructor instructor;
    private int timeWorked;


    Educator(long id, String name){
        this.instructor = new Instructor(id, name);
        Instructors.getInstance().add(this.instructor);
        this.timeWorked = 0;
    }

    public int getTimeWorked() {
        return this.timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner s: learners){
            this.teach(s,numberOfHours/learners.length);
        }
    }
}
