package com.neuedu.api.object0728.one;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        /**
         * 45，"tom",45.6,45
         */
        ArrayList arrayList=new ArrayList();
        arrayList.add(45);
        arrayList.add("tom");
        arrayList.add(45.6);
        arrayList.add(45);
        System.out.println(arrayList);
        System.out.println("==============================================");
        for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("==========================");
        for(Object obj:arrayList){
            System.out.println(obj);
        }
        System.out.println("=============================");
        Iterator iterator=arrayList.iterator();
        while(iterator.hasNext()) {
            Object obg=iterator.next();
            System.out.println(obg);
        }
    }
}
