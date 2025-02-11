package com.neuedu.objectexample.second;

public class Singleton03 {

    private volatile  static Singleton03 instance;

    private  Singleton03(){}

    public static Singleton03 getInstance(){
        if(instance==null){
            synchronized (Singleton03.class){
                if(instance==null){
                    instance=new Singleton03();
                }
            }
        }
        return instance;
    }

}
