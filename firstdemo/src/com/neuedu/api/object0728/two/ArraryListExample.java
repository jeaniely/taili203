package com.neuedu.api.object0728.two;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraryListExample {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();

        Student student=new Student();
        student.setName("tom");
        student.setAge(21);
        student.setSex("m");
        students.add(student);

        Student student2=new Student();
        student2.setName("lili");
        student2.setAge(21);
        student2.setSex("w");
        students.add(student2);

        Student student3=new Student();
        student3.setName("jasper");
        student3.setAge(18);
        student3.setSex("m");
        students.add(2,student3);

        students.add(2,student3);
        students.add(2,student3);
        System.out.println(students);
        System.out.println("=======================");
        for(int i=0;i<students.size();i++){
            System.out.println(students.get(i));
          /*  Student s=students.get(i);
            System.out.println(s.getName()+" "+s.getSex()+"   "+s.getAge());*/
        }
        System.out.println("=======================");
        for(Student s:students){
            System.out.println(s);
        }
        System.out.println("============================");
        Iterator<Student> iterator=students.iterator();
        while(iterator.hasNext()){
            Student student1=iterator.next();
            System.out.println(student1);
        }
    }
}
