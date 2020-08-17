package com.neuedu.inner.three;

public class Test {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
        OuterClass.InnerClass inner=outer.getInnerClass();
    }
}
