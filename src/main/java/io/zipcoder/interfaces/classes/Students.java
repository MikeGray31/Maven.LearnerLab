package io.zipcoder.interfaces.classes;

import java.util.List;

public class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students(){
        Student student1 = new Student(1, "Mike G");
        Student student2 = new Student(2, "Mike S");
        Student student3 = new Student(3, "Mike K");
        super.add(student1);
        super.add(student2);
        super.add(student3);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        List<Student> newList = this.getPersonList();
        Student[] newArray = new Student[newList.size()];
        for(int i = 0; i < newList.size(); i++){
            newArray[i] = newList.get(i);
        }
        return newArray;

    }

    @Override
    public Student findById(long id) {
        List<Student> newList = this.getPersonList();
        for(Student s: newList){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

}
