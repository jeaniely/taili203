package com.neuedu.object.static01;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Person person=new Person();
        Person person1=new Person();
        Person person2=new Person();

        person.eat();
        Person.eat();

    }

}
