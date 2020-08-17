package com.neuedu.firsthomework;

import java.util.ArrayList;

public class HomeWork_02 {
    /**
     * 1:注释
     *    单行注释//
     *    多行注释
     *    文档注释
     * 2:for
     * 3:for双重循环
     * 4：break
     * 5：if
     * 6：表达式
     * @param args
     */
    public static void main(String[] args) {
        int num=0;
        for(int n=200;n<500;n++){
            boolean flag=true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }

            if(flag){
                System.out.print(n+"\t");
                num++;
                if(num%10==0){
                    System.out.println();// System.out.print("\n");
                }
            }

        }

        ArrayList a;
    }
    /*
    * 2：查询200-500之间的素数，并输入，每行显示10个数值
    * 1）什么是素数，怎么判断是素数
    *    被1和本身整除的数
    *    boolean flag=true;
    *    for(int i=2;i<n;i++){
    *        if(n%i==0){
    *          flag=false;
    *          break;
    *       }
    *    }
    * 2) 加一个外循环
    *    for(int n=200;n<500;n++){
    *
    *    }
    * 3)输出
    *    if(flag){
    *      sout(n)
    *     }
    *
    *
    * */
}
