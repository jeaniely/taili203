package com.neuedu.function;

import java.util.ArrayList;

public class Function_03 {
    public static void main(String[] args) {
        /*FunctionOver f=new FunctionOver();
        System.out.println(f.add(12,45));
        System.out.println(f.add(12.56,45));*/
        System.out.println(FunctionOver.add(12,78));
    }
}

/*
* 两个数相加
* 数据类型：两个整数
*           两个double
*           一个整数一个double
* 返回类型： int
*            double
*
* */
class FunctionOver{
   static int add(int a,int b){
        return a+b;
    }
   static double add(double a,double b){
        return a+b;
    }

   static double add(double a,int b){
        return a+b;
    }

   static double add(int a,double b){
        return a+b;
    }
    static double add(double a,double b,int c){
        return a+b+c;
    }
}