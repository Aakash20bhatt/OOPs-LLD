package com.company.Oops.Encapsulations;

public class Student{
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("My name is : "+ this.name);
        System.out.println("My age is : "+this.age);
    }
}
