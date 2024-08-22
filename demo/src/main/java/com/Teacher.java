package com;
public class Teacher extends Person implements Course{
    protected String grade;
    protected String course;
    //Learned how to call super class constructor from sub class
    public Teacher(String grade, String course, String name, int age, int id, String address, String contact, String email) {
        super(name, age, id, address, contact, email);
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