package com.neuedu.api.object0729.two;

import java.util.TreeSet;

public class TreeSetExample02 {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        treeSet.add(45);
        treeSet.add(78);
        treeSet.add(12);
        treeSet.add(50);

        for(Object i:treeSet){
            System.out.println(i);
        }
        String i;
    }
}
