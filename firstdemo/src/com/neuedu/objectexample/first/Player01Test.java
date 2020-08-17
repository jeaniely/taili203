package com.neuedu.objectexample.first;

import java.util.function.Function;

public class Player01Test {
    public static void main(String[] args) {
        while(true) {
           Player01 player01=Player01.creat();
            if(player01==null){
                System.out.println("对不起，已经创建了十一个对象，不能再创建其他的了");
                break;
            }else{
                System.out.println("创建了一个对象");
            }
        }
    }
}
