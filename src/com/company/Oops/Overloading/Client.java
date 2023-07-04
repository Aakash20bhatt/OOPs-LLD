package com.company.Oops.Overloading;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        // Java example of overloading
        Arrays.sort(new int[]{10,9,11});
        fun(10,20);
        fun("h1","bye");
        fun(10,"bye");
    }

    static void fun(int x, int y){
        System.out.println(x+y);
    }

    static void fun(String x, String y){
        System.out.println(x+y);
    }

    static void fun(int x, String y){
        System.out.println(x+y);
    }

//    int fun(int x, int y){
//        Error
//        return x+y
//    }
}
