package com.company.Oops.Constructor.Demo3;

public class Person {

    // Constructor chaning

    int age ;
    String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    Person(int age){
        this(age, null);
    }

    Person(String name){
        this(0,name);
    }

    Person(){
        this(0,null);
    }

    void display(){
        System.out.println("MY age is : "+ this.age);
        System.out.println("My name is " + this.name);
        System.out.println();
    }
}
