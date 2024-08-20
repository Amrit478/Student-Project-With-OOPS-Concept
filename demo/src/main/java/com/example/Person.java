package com.example;

import java.util.*;

public abstract class Person {
    //Attributes
    protected String name;
    protected int age;
    protected String address;
    protected String contact;
    protected String email;

    // Constructors
    public Person(String name, int age, String address, String contact, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    //Getters and Setters
    public abstract void search();
    public abstract void sort();
    public abstract void add();
    public abstract void update();
    public abstract void delete();
}