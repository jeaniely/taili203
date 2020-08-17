package com.neuedu.inner.seven;

public class Test {
    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        InnerClass innerClass=outerClass.getInnerClass(8);
        System.out.println(innerClass.getNumber());
    }
}
