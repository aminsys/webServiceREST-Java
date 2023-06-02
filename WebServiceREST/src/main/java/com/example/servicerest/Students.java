package com.example.servicerest;

public class Students {
    private String name;
    private int score;
    private int id;

    // Getters
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public int getScore(){
        return this.score;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setScore(int score){
        this.score = score;
    }

    public void setId(int id){
        this.id = id;
    }


}
