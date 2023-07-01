package com.company.Oops1.Encapsulations;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        Student st = new Student();
        st.setAge(23);
//        st.age = 10; // which is voilating encapsulations
        st.setName("Aakash");
        st.display();
    }
}
