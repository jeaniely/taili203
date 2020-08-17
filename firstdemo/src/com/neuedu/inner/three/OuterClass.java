package com.neuedu.inner.three;

public class OuterClass {
    private String name;

    private void outerDisplay(){
        System.out.println("outerclass.....");
    }

     class InnerClass{
        public InnerClass(){
            name="123";
            System.out.println(name);

            outerDisplay();
        }
    }

    public InnerClass getInnerClass(){
        return new InnerClass();
    }

}
