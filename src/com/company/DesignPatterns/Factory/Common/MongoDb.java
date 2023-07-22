package com.company.DesignPatterns.Factory.Common;

public class MongoDb implements Query{
    @Override
    public void execute() {
        System.out.println("Logic to execute the MongoDb query");
    }
}
