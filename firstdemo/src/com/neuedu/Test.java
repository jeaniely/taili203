package com.neuedu;

public class Test{
    public static void main(String[] args) {
        Integer b = new Integer(10);
        add(b);
        System.out.println(b.intValue());
        int[] a=new int[0];
    }
    static void add(Integer b) {
        int i = b.intValue();
        i+= 3;
        b = new Integer(i);
    }

}



