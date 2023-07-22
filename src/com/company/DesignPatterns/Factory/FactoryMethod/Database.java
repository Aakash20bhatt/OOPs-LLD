package com.company.DesignPatterns.Factory.FactoryMethod;

import com.company.DesignPatterns.Factory.Common.Query;

public abstract class Database {
    public void doWork(){
        Query q = getQuery();
        q.execute();
    }

    abstract Query getQuery();// This is a factory method-> A method which create objects
}
