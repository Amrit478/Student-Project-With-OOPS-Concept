package com.example;

import java.util.*;

public class Student extends Person {
    public Student(String name, int age, String address, String contact, String email) {
        super(name, age, address, contact, email);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    @Override
    public void search() {
        // implement search logic here
    }
    @Override
    public void sort() {
        // implement sort logic here
    }
    @Override
    public void add() {
        // implement add logic here
    }
    @Override
    public void update() {
        // implement update logic here
    }
    @Override
    public void delete() {
        // implement delete logic here
    }
    // Add more methods here
}