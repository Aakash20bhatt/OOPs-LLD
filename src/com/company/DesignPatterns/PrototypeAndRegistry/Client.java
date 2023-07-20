package com.company.DesignPatterns.PrototypeAndRegistry;

public class Client {

    public static void populatedRegistry(){
        StudentRegistry reg = StudentRegistry.inst;
        Student proto = new Student();
        proto.setName("ABC");
        proto.setAge(10);
        reg.registerAPrototype("Normal Student", proto);

        MerirtStudent msProto = new MerirtStudent();
        msProto.setAge(12);
        msProto.setName("DEF");
        msProto.setScholarShip(100);
        reg.registerAPrototype("Merit Student", msProto);

    }
    public static void main(String[] args) {

        populatedRegistry();

        Student s1 = new Student();
        s1.setAge(10);
        s1.setName("ABC");

        Student copy = getStudent(s1);
        System.out.println(copy.getName());
        System.out.println(copy.getAge());

        MerirtStudent s2 = new MerirtStudent();
        s2.setAge(20);
        s2.setName("DEF");
        s2.setScholarShip(100);

        Student copy2 = getStudent(s2);
        System.out.println(copy2.getName());
        System.out.println(copy2.getAge());

    }

    static Student getStudent(Student org){
        return org.clone();
    }
}
