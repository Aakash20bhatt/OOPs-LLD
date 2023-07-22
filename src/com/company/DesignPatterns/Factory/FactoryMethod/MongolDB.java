package com.company.DesignPatterns.Factory.FactoryMethod;

import com.company.DesignPatterns.Factory.Common.MsSqlQuery;
import com.company.DesignPatterns.Factory.Common.Query;

public class MongolDB extends Database{
    @Override
    public Query getQuery() {
        return new MsSqlQuery();
    }
}
