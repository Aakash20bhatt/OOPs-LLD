package com.company.DesignPatterns.Factory.FactoryMethod;

public class Client {// This could be user service

    public static void main(String[] args) {
        Database db = new MongolDB();
        db.doWork();
    }
}
