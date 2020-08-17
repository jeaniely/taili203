package com.neuedu.api.object0730.one;

import java.util.HashMap;

public class HashMapExample02 {
    public static void main(String[] args) {
        HashMap<String,Student> hashMap=new HashMap<>();
        Student student1=new Student("001","zhang","w",20);
        Student student2=new Student("002","li","m",18);
        Student student3=new Student("003","chen","w",21);
        Student student4=new Student("004","ji","m",19);

        hashMap.put(student1.getSid(),student1);
        hashMap.put(student2.getSid(),student2);
        hashMap.put(student3.getSid(),student3);
        hashMap.put(student4.getSid(),student4);

        System.out.println("原始数据：");
        System.out.println(hashMap);
        System.out.println("======================");

        //删除：
        Student s=hashMap.remove("001");
        System.out.println("删除数据："+s);
        System.out.println("删除之后的数据");
        hashMap.forEach((k,v)-> System.out.println(k+"  "+v));

        //value是否包含在hashMap中
        boolean flag=hashMap.containsValue(student3);
        System.out.println("结果是："+flag);


    }
}
