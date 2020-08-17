package com.neuedu.object.first;

public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="tom";
        person.age=18;
        System.out.println(person.name+" "+person.age);
        person.eat();
    }
}
