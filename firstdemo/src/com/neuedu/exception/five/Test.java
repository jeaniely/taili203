package com.neuedu.exception.five;

public class Test {
    public static void main(String[] args) {
        /*values:此枚举类中所有值，返回值数组*/
        for(Color c:Color.values()){
            System.out.println(c+"  "+c.ordinal());
        }
        System.out.println("==============================");

        for(ErrorInfo e:ErrorInfo.values()){
            System.out.println(e.getCode()+"  "+e.getInformation());
        }
        /*根据输入的code值，查询出信息*/

        System.out.println(ErrorInfo.getInformation(500));

        System.out.println("================================================");

        for(ErrorInfo02 e:ErrorInfo02.values()){
            System.out.println(e.getCode()+"   "+e.getInformation());
        }


    }
}
