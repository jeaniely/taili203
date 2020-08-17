package com.neuedu.inner.two;

public class Test {
    public static void main(String[] args) {
        OuterClass.InnerClass inner=new OuterClass().new InnerClass();
        inner.getOuterClass().display();
    }
}
