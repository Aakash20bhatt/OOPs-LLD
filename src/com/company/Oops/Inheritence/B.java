package com.company.Oops.Inheritence;

public class B extends A{
    int d2 =20;
    int d=200;
//    B(){
//        System.out.println("I am in B");
//    }
    B(int d1, int d2){
        super(d1);
        this.d2 = d2;
    }
    void fun2(){
        System.out.println("fun2 of B");
    }
    void fun(){
        System.out.println("fun2 of B");
    }
}
