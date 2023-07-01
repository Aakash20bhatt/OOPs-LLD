package com.company.Oops1.Encapsulations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

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
