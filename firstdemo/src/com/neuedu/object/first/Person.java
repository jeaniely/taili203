package com.neuedu.object.first;

public class Person {
    /*
    类：
    * 属性：变量--成员变量
    * 行为：方法--成员方法
    *
    *  构造器：特殊的方法；没有返回类型，方法名与类名相同
              作用之一：类实例化--生成对象
              作用2：赋值--成员变量
    *
    * */
    String name;
    int age;
    int height;
    public Person(){}/*默认构造器*/
    public Person(String name){
        this.name=name;//本类对象
    }
    public Person(String name,int age){
        this(name);/*this()  调用的本类中的构造器，必须写在第一行*/
        this.age=age;//本类对象
    }
    public Person(String name,int age,int height){
        this(name,age);/*this()  调用的本类中的构造器，必须写在第一行*/
        this.height=height;//本类对象
    }
    void eat(){
        System.out.println("吃东西");
    }

}
