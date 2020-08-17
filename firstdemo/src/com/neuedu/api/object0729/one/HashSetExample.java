package com.neuedu.api.object0729.one;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add(45);
        hashSet.add("tom");
        hashSet.add(45.6);
        hashSet.add(45);

        System.out.println(hashSet);
        System.out.println("==============================");
        for(Object obj:hashSet){
            System.out.println(obj);
        }
        System.out.println("==============================");
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()) {
            Object obj=iterator.next();
            System.out.println(obj);
        }

        }
    }

