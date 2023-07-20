package com.company.DesignPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Student(){

    }

    public Student(Student obj){
        this.age = obj.age;
        this.name = obj.name;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
