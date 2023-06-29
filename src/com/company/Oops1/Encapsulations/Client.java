package com.company.Oops1.Encapsulations;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(23);
//        st.age = 10; // which is voilating encapsulations
        st.setName("Aakash");
        st.display();
    }
}
