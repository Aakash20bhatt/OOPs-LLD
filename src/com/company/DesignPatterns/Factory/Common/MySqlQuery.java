package com.company.DesignPatterns.Factory.Common;

public class MySqlQuery implements Query{
    @Override
    public void execute() {
        System.out.println("Logic to execute the sql query");
    }
}
