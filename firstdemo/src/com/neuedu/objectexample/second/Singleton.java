package com.neuedu.objectexample.second;

public class Singleton {

    private static  Singleton intance;

    private  Singleton(){}

    public static Singleton getInstance(){
        if(intance==null){
            intance=new Singleton();
        }
        return intance;
    }
}
