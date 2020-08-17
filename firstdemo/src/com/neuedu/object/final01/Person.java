package com.neuedu.object.final01;

public  class Person {
    private  String name;
    public final String SEX="男";

    public String getName() {
        return name;
    }

    public void setName(final String name) {
       /* name="dddd";*/
        this.name = name;
    }
    public  final void eat(){
        System.out.println("吃");
    }
}
