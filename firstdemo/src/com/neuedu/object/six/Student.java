package com.neuedu.object.six;

public class Student extends Person {
    @Override
   public void eat() {
        System.out.println("吃水果");
    }

    @Override
    public void sleep() {
        System.out.println("睡沙发");
    }

    @Override
    public void cry() {
        System.out.println("陶淘大哭");
    }
}
