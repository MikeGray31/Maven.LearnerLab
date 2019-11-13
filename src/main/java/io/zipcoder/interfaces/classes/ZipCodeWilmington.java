package io.zipcoder.interfaces.classes;

import io.zipcoder.interfaces.interfaces.Teacher;

import java.util.HashMap;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private Students students;
    private Instructors instructors;

    private ZipCodeWilmington(){ }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double hours){
        teacher.lecture(students.getInstance().toArray(), hours);
    }

    public void hostLecture(long id, double hours){
        Instructor teacher = instructors.getInstance().findById(id);
        hostLecture(teacher, hours);
    }

    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student,Double> studyMap = new HashMap<>();
        for(Student s: students.getInstance().toArray()){
            studyMap.put(s, s.getTotalStudyTime());
        }
        return studyMap;
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

}
