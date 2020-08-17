package com.neuedu.object.three;

public class Person {
    /**
     * 继承：一个类实现另一类中的方法和属性
     *       另一类：父类，超类
     *       一个类：子类
     *       子类实现父类中的方法和属性,子类可以有自己独有的方法和属性
     *
     *       作用：代码重用
     *
     *限定修饰符
     * private 只能在本类中有效
     * 默认 ：本类、同一包中有效
     * protected：本类中、同一包中、不同包的子类中有效
     * public：本类中、同一包中、不同包有效
     *
     * 可以修饰类，变量，方法
     * 其中修饰类：默认，public
     * 修饰变量和方法：private、默认、protected、public
     *
     *
     */
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
