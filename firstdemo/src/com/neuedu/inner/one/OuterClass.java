package com.neuedu.inner.one;

public class OuterClass {
    private String name;
    private int age;
    public class InnerClass{
        public InnerClass(){
            name="zhang";
            age=12;
        }

        public void display(){
            System.out.println("name:"+name+" age:"+age);
        }
    }
}
