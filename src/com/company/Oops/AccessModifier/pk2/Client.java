package com.company.Oops.AccessModifier.pk2;

import com.company.Oops.AccessModifier.pk1.Person;

public class Client {
    public static void main(String[] args) {
        Person p = new Person();
        p.d1=100;
//        p.d2 = 200;//Error
//        p.d3 = 300 Error
    }
}
