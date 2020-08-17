package com.neuedu.object.second;

public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("lili");
        person.setAge(18);
        System.out.println(person.getName()+" "+person.getAge());
        System.out.println(person);/*自动调用toString方法*/

    }
}
