package com.neuedu.objectexample.first;

public class Player01 {
    private static int sum;

    private Player01(){
    }

    public static Player01 creat(){
            sum++;
            if(sum<=11) {
                return new Player01();
            }else{
                return null;
            }

    }
}
