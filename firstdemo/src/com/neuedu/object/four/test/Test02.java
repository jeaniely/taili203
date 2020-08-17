package com.neuedu.object.four.test;

import com.neuedu.object.four.Person;

/**
 * 不同的包中只有public有效
 */
public class Test02 {
    public static void main(String[] args) {
        Person person=new Person();
       /* person.name="lili";
        person.age=12;
        person.sex="男";*/
        person.height=180;
    }
}
