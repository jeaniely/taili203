package com.neuedu.inner.five;

public class OuterClass {
    private  String name="neuedu";
    public static String sname="tianjin";

    static class InnerClass{
        public static String  innerName="dalian";
        private String innerage="tc";
        public void display(){
            System.out.println("outerclass"+sname);
        }
    }
}
