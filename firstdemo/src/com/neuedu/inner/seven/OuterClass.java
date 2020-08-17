package com.neuedu.inner.seven;

public class OuterClass {
    public InnerClass getInnerClass(final int num){
      return  ()->num+1;
    }
}

interface InnerClass{
    int getNumber();
}