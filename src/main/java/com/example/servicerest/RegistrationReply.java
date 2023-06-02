package com.example.servicerest;

public class RegistrationReply {

    private String studentName;
    private int studentId;
    private int studentScore;
    private String registered;

    // Getters
    public String getStudentName(){
        return this.studentName;
    }

    public int getStudentId(){
        return this.studentId;
    }

    public int getStudentScore(){
        return this.studentScore;
    }

    public String getRegistered(){
        return this.registered;
    }

    // Setters
    public void setStudentName(String name){
        this.studentName = name;
    }

    public void setStudentId(int id){
        this.studentId = id;
    }

    public void setStudentScore(int score){
        this.studentScore = score;
    }

    public void setRegistered(String registered){
        this.registered = registered;
    }

}
