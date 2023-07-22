package com.company.DesignPatterns.Factory.Common;

public class MsSqlQuery implements Query{
    @Override
    public void execute() {
        System.out.println("Logic to execute the MsSql query");
    }
}
