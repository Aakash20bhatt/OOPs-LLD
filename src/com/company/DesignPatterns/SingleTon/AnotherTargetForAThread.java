package com.company.DesignPatterns.SingleTon;

public class AnotherTargetForAThread implements Runnable{

    @Override
    public void run(){
        DBConn db2 = DBConn.getInstance();
        System.out.println("Db2");
    }
}
