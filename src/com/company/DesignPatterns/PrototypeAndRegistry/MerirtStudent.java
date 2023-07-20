package com.company.DesignPatterns.PrototypeAndRegistry;

public class MerirtStudent extends Student{

    private int scholarShip;

    public void setScholarShip(int scholarShip) {
        this.scholarShip = scholarShip;
    }

    public int getScholarShip(){
        return scholarShip;
    }

    public MerirtStudent(){

    }

    public MerirtStudent(MerirtStudent obj){
        super(obj);
        this.scholarShip = obj.scholarShip;
    }

    @Override
    public MerirtStudent clone() {
        return new MerirtStudent(this);
    }
}
