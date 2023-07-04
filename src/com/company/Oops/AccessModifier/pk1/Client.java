package com.company.Oops.AccessModifier.pk1;

public class Client {
    public static void main(String[] args) {
        Person p = new Person();
        p.d1 = 10;
        p.d2 = 20;
//        p.d3 = 30;// Error
    }
}
