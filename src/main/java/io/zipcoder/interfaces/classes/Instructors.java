package io.zipcoder.interfaces.classes;

import java.util.List;

public class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor person1 = new Instructor(100, "Jack");
        Instructor person2 = new Instructor(200, "Daniels");
        Instructor person3 = new Instructor(300, "Whiskey");
        super.add(person1);
        super.add(person2);
        super.add(person3);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }


    @Override
    public Instructor[] toArray() {
        List<Instructor> newList = this.getPersonList();
        Instructor[] newArray = new Instructor[newList.size()];
        for(int i = 0; i < newList.size(); i++){
            newArray[i] = newList.get(i);
        }
        return newArray;
    }

    @Override
    public Instructor findById(long id) {
        List<Instructor> newList = this.getPersonList();
        for(Instructor s: newList){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }
}
