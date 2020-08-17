package com.neuedu.api.object0729.one;

import java.util.HashSet;

public class HashSetExample02 {
    public static void main(String[] args) {
        /**
         * 使用Student对象的添加，还要实现删除和查找
         */
        HashSet<Student> students=new HashSet<>();
        Student student=new Student();
        student.setName("tom");
        student.setSex("m");
        student.setAge(19);
        Student student1=new Student();
        student1.setName("lili");
        student1.setSex("w");
        student1.setAge(18);
        Student student2=new Student();
        student2.setName("jasper");
        student2.setSex("m");
        student2.setAge(21);
        Student student3=new Student();
        student3.setName("anan");
        student3.setSex("w");
        student3.setAge(22);

        students.add(student);
        students.add(student1);
        students.add(student3);
        students.add(student2);
        students.add(null);
        System.out.println("原数据：");
        System.out.println(students);

        //删除数据
        students.remove(student1);
        System.out.println("删除之后的数据显示：");
       for(Student s:students){
           System.out.println(s);
       }

       //判断对象是否存在，
        Student student4=new Student();
       student4.setName("zhang");
       student4.setSex("m");
       student4.setAge(23);
        boolean flag=students.contains(student4);
        System.out.println("存在的结果："+flag);
    }
}
