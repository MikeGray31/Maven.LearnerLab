package io.zipcoder.interfaces.classes;

import io.zipcoder.interfaces.interfaces.Learner;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long id, String name){
        super(id, name);
        totalStudyTime = 0;
    }



    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
