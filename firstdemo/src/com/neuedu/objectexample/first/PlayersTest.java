package com.neuedu.objectexample.first;

public class PlayersTest {
    public static void main(String[] args) {
        Players players=Players.creat();
        if(players==null){
            System.out.println("对不起，已经创建了十一个对象，不能再创建其他的了");
        }
    }
}
