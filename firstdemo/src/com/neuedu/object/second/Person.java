package com.neuedu.object.second;

public class Person {

    /**
     * 封装：保证属性的安全、完整
     *       使用的方法：私有化属性 private
     *       调用，使用公共的setter和getter方法
     *
     *       其他方式：1）输出：可使用toString实现
     *                 2）输入：构造器
     */
   private String name;
   private int age;
   public Person(){}
   public Person(String name,int age){
       this.name=name;
       this.age=age;
   }
    /**
     * name的setter方法
     * 写
     */
   public void setName(String name){
       if(name!=null) {
           this.name = name;
       }
   }
    /**
     * name的getter方法
     * 读取
     */
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18){
           this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
