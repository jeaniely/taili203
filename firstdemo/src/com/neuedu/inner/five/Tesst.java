package com.neuedu.inner.five;

public class Tesst {
    public static void main(String[] args) {
        System.out.println(OuterClass.InnerClass.innerName);
        OuterClass.InnerClass inner= new OuterClass.InnerClass();/*OuterClass.InnerClass作为类*/
        inner.display();

    }
}
