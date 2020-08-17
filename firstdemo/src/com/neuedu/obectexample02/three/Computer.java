package com.neuedu.obectexample02.three;


import com.neuedu.objectexample.seven.Compute;

public class Computer extends Student {

    private double operation;
    private double englishWrite;

    public Computer(){}
    public Computer(String sid,String name,String sex,int age,double middleTerm,double finalTerm,double operation,double englishWrite){
        super(sid,name,sex,age,middleTerm,finalTerm);
        this.operation=operation;
        this.englishWrite=englishWrite;
    }

    public void setOperation(double operation) {
        this.operation = operation;
    }

    public void setEnglishWrite(double englishWrite) {
        this.englishWrite = englishWrite;
    }

    @Override
    public double getScore() {
        return operation*0.4+englishWrite*0.2+getMiddleTerm()*0.2+getMiddleTerm()*0.2;
    }

    @Override
    public void showAll() {
        System.out.println(super.toString()+"综合成绩："+getScore());
    }
}
