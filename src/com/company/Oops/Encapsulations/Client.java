package com.company.Oops.Encapsulations;

public class Client {
    public static void main(String[] args) throws Exception{
        Student st = new Student();
        st.setAge(23);
//        st.age = 10; // which is voilating encapsulations
        st.setName("Aakash");
        st.display();
    }
}
