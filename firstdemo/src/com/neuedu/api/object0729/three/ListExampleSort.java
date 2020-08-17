package com.neuedu.api.object0729.three;

import java.util.ArrayList;
import java.util.Collections;

public class ListExampleSort {
    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<>();
        Student student1=new Student("li","m",18);
        Student student2=new Student("zhang","w",22);
        Student student3=new Student("wu","m",19);
        Student student4=new Student("xie","w",23);
        Student student5=new Student("ji","m",20);

        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);

        System.out.println("源数据：");
        System.out.println(arrayList);

       /* Collections.sort(arrayList);*/
        Collections.sort(arrayList,new MyComparator());
        System.out.println("排序之后的数值：");
        System.out.println(arrayList);


        Collections.reverse(arrayList);
        System.out.println("反转之后：");
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println("洗牌：");
       /* System.out.println(arrayList);*/
        arrayList.forEach((e)-> System.out.println(e));

    }
}
