package com.neuedu.obectexample02.three;

public abstract class Student {
    private String sid;
    private String name;
    private String sex;
    private int age;
    private double score;
    private double middleTerm;
    private double finalTerm;

    public Student(){}
    public Student(String sid,String name,String sex,int age,double middleTerm,double finalTerm){
     this.sid=sid;
     this.name=name;
     this.sex=sex;
     this.age=age;
     this.middleTerm=middleTerm;
     this.finalTerm=finalTerm;
    }

    public double getMiddleTerm() {
        return middleTerm;
    }

    public double getFinalTerm() {
        return finalTerm;
    }

    public abstract double getScore();
    public abstract void showAll();

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setMiddleTerm(double middleTerm) {
        this.middleTerm = middleTerm;
    }

    public void setFinalTerm(double finalTerm) {
        this.finalTerm = finalTerm;
    }

    @Override
    public String toString() {
        return "学号:"+sid+" 姓名："+name+" 性别："+sex+" 年龄："+age;
    }
}
