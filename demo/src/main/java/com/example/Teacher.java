package com.example;

public class Teacher implements Course{
    private String grade;
    private String course;
    //Constructor
    public Teacher(String grade, String course)
    {
        this.grade = grade;
        this.course = course;
    }

    public  String getGrade(){
        return grade;
    }
    public  void setGrade(String grade){
        this.grade = grade;
    }
    public  String getCourse(){
        return course;
    }
    public  void setCourse(String course){
        this.course = course;
    }
}