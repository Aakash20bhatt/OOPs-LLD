package com.company.DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    public static final StudentRegistry inst = new StudentRegistry();

    private StudentRegistry(){

    }

    private Map<String, Student> studentDataStore = new HashMap<>();

    public void registerAPrototype(String key, Student proto){
        studentDataStore.put(key,proto);
    }

    public Student getAPrototype(String key){
        return studentDataStore.get(key);
    }
}
