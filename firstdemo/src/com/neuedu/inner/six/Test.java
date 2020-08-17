package com.neuedu.inner.six;

public class Test {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
       InnerClass innerClass= outer.getInnerClass(6);
        System.out.println(innerClass.getNumber());
    }
}
