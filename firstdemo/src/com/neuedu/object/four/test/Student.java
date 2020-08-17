package com.neuedu.object.four.test;

import com.neuedu.object.four.Person;

/***
 *  不同包的子类中，protected，public修饰的
 */
public class Student extends Person {
    public Student(String name,int age,String sex,int height){
       /* super.name=name;
        super.age=age;*/
        super.sex=sex;
        super.height=height;
    }
}
