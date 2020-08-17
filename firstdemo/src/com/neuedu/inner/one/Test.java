package com.neuedu.inner.one;

public class Test {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
        OuterClass.InnerClass inner=outer.new InnerClass();
        inner.display();

        OuterClass.InnerClass inner01=new OuterClass().new InnerClass();
    }
}
