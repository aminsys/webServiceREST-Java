package com.example.servicerest;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {

    private List<Students> studentInformation;

    // Utilizing the Singleton design pattern for this class.
    private static StudentRegistration studentRegistered = null;
    public StudentRegistration(){
        this.studentInformation = new ArrayList<Students>();
    }

    public static StudentRegistration getInstance() {
        // ensuring the singleton design pattern.
        if(studentRegistered == null) {
            studentRegistered = new StudentRegistration();
        }
        return studentRegistered;
    }

    public void add(Students student){
        studentInformation.add(student);
    }

    public String RemoveStudent(int id){
        for(int i = 0; i<studentInformation.size(); i++){
            Students std = studentInformation.get(i);
            if(std.getId() == id){
                studentInformation.remove(i);
                return "Deleted student successfully!";
            }
        }
        return "Delete student failed";
    }

    public String updateStudent(Students student, int id){
        for(int i=0; i<studentInformation.size(); i++){
            Students std = studentInformation.get(i);
            if(std.getId() == id){
                studentInformation.set(i, student);
                return "Updated student successfully!";
            }
        }
        return "Update student failed!";
    }

    public List<Students> getAllStudents(){
        return this.studentInformation;
    }

}
