package com.neuedu.objectexample.six;

public class Test {
    public static void main(String[] args) {
       Fruit fruit= Gardener.create();
       if(fruit==null){
           System.out.println("果园里没有这个水果");
       }
    }
}
