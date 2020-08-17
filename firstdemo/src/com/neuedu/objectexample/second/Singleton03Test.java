package com.neuedu.objectexample.second;

public class Singleton03Test {
    public static void main(String[] args) {
        Singleton03 singleton03=Singleton03.getInstance();
        System.out.println(singleton03);
        Singleton03 singleton04=Singleton03.getInstance();
        System.out.println(singleton04);
        Singleton03 singleton05=Singleton03.getInstance();
        System.out.println(singleton05);
    }
}
