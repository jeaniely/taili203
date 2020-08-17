package com.neuedu.object.ten;

public class Student implements Person{
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }

    @Override
    public void cry() {
        System.out.println("大声哭");
    }
}
