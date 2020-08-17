package com.neuedu.object.five;

public class Student extends Person {
    public Student(){
       /* super();*///默认
        System.out.println("student01");
    }
    public Student(String name){
        super(name);/*调用父类的构造器*/
        System.out.println("student02");
    }

    public Student(String name,int age,String sex){
        super(name,age);
        /*this(name);*/ //this() 和 super()都调用构造器时，只能使用一种
        super.sex=sex;/*父类对象*/
        System.out.println("student03");
    }
}
