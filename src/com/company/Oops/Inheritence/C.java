package com.company.Oops.Inheritence;

public class C extends B{

    int d3;
//
//    C(){
//        System.out.println("I am in C");
//    }

    C(int d1, int d2 ,int d3){
        super(d1,d2);
        this.d3 = d3;

        System.out.println("Ans : "+d1+" "+d2 +" "+d3);
        super.fun();
    }
}
