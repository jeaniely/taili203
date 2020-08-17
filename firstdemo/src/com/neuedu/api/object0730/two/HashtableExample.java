package com.neuedu.api.object0730.two;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableExample {
    /**
     * Hashtable
     * 1)key,value不能为null
     * 2）同步，线程安全
     * @param args
     */
    public static void main(String[] args) {
        Hashtable<String,String> hashtable=new Hashtable<>();
        hashtable.put("001","zhang");
        hashtable.put("002","wu");
        hashtable.put("003","li");
        System.out.println(hashtable);
        System.out.println("======================");
        Set<String> keys=hashtable.keySet();
        for(String k:keys){
            System.out.println(k+"  "+hashtable.get(k));
        }
        System.out.println("===========================");
        for(Map.Entry<String,String> e:hashtable.entrySet()){
            System.out.println(e.getKey()+"  "+e.getValue());
        }
        System.out.println("=============================");
        hashtable.forEach((k,v)-> System.out.println(k+"  "+v));
    }
}
