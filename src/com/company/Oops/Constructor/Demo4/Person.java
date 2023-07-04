package com.company.Oops.Constructor.Demo4;

public class Person {

    int age;
    String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    Person(Person p){
        this(p.age,p.name);
    }

    void display(){
        System.out.println("My name is : "+ this.name);
        System.out.println("My age is : "+this.age);
        System.out.println();
    }

    @Override
    protected void finalize() throws Throwable { // Used to close the files or ports that is remain opened by object.
        super.finalize();
    }
}
