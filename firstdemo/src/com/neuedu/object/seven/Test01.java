package com.neuedu.object.seven;

public class Test01 {
    public static void main(String[] args) {
        /*
        * 多态：同一方法，实现了不同的行为
        *  条件：1）子类继承或实现父类
        *        2）子类重写了父类方法
        *        3）父类对象由子类实现
        * */
        Person person=new Student();
        person.eat();

        Person person1=new Teacher();
        person1.eat();


    }
}
