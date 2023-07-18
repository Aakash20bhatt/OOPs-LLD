package com.company.DesignPatterns.SingleTon;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConn {

    private DBConn(){}

    private static DBConn inst;
    private static Lock lock = new ReentrantLock();

    public static DBConn getInstance(){
        if(inst == null){
            lock.lock();
            if(inst==null){
                inst = new DBConn();
            }
            lock.unlock();
        }

        return inst;
    }
}
