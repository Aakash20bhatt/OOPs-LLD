package com.company.DesignPatterns.SingleTon;

public class TargetForAThread implements Runnable{

    @Override
    public void run(){
        DBConn db1 = DBConn.getInstance();
        System.out.println("Db1");
    }
}
