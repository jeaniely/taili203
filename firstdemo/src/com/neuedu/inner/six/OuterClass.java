package com.neuedu.inner.six;

public class OuterClass {
    public InnerClass getInnerClass(final int num){
      return  new InnerClass(){
            @Override
            public int getNumber() {
                return num+1;
            }

          @Override
          public int getString() {
              return num;
          }
      };
    }
}

interface InnerClass{
    int getNumber();
    int getString();
}