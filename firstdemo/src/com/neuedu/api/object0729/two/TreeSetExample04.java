package com.neuedu.api.object0729.two;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample04 {
    public static void main(String[] args) {
        TreeSet<Student> students=new TreeSet<>(new MyComparator());
        Student student1=new Student("tom","m",18);
        Student student2=new Student("lili","w",22);
        Student student3=new Student("wu","m",20);
        Student student4=new Student("zhang","m",19);
        Student student5=new Student("jasper","m",21);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Iterator<Student> studentIterator=students.iterator();
        while(studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }

    }
}
