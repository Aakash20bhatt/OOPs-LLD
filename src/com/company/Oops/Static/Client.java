package com.company.Oops.Static;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.age = 10;
        s1.name = "Nitesh";

        s2.age = 20;
        s2.name = "Tejas";

        Student.schoolName = "DAV";

        s1.schoolName = "KRM";

        System.out.println(s2.schoolName);
    }
}
