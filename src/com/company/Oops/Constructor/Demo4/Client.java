package com.company.Oops.Constructor.Demo4;

public class Client {
    public static void main(String[] args) {
        Person p1 = new Person(10,"ABC");
//        Person p2 = p1; In this, p1&p2 is same.

        Person p2 = new Person(p1); //Copy constructor
        p2.age = 20;
        p2.name = "DEF";
        p1.display();
        p2.display(); // Get different output because ref is diff.
    }
}
