package com.neuedu.objectexample.first;

public class Players {
    private static int sum;

    private Players(){
        System.out.println("创建了一个对象");
    }

    public static Players creat(){
        for(;sum<11;sum++){
            new Players();
        }
        return null;
    }


}
