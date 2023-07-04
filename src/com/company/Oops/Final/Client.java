package com.company.Oops.Final;

public class Client {
    public static void main(String[] args) {
        final int x = 10; // variable
//        x=100;Error

        System.out.println(x);

        DemoClass d = new DemoClass();
//        d.x = 100; Error
        System.out.println(d.x);
        System.out.println(d.y);
    }
}
