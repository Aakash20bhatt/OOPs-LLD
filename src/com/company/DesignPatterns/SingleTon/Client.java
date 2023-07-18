package com.company.DesignPatterns.SingleTon;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        DBConn dbconn = DBConn.getInstance();

        Thread t1 = new Thread(new TargetForAThread());
        Thread t2 = new Thread(new AnotherTargetForAThread());


        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
