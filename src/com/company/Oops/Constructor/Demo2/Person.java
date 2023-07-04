package com.company.Oops.Constructor.Demo2;

public class Person {
    int age ;
    String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println("MY age is : "+ this.age);
        System.out.println("My name is " + this.name);
    }
}
