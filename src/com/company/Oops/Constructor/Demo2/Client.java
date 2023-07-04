package com.company.Oops.Constructor.Demo2;

public class Client {
    public static void main(String[] args) {
        Person p = new Person(10, "ABC");

        // Cannot pass default const here
        // Person p = new Person();

        p.display();
    }
}
