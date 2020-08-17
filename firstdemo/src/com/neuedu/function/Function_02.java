package com.neuedu.function;

import java.util.Scanner;

public class Function_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入年份：");
        int year=scanner.nextInt();

        YearFuncton yearFuncton=new YearFuncton();
        boolean flag=yearFuncton.fun(year);

        if(flag){
            System.out.println("是闰年");
        }else {
            System.out.println("是平年");
        }

    }

}
/*
* 输入一个年，判断这个年是平年还是闰年--使用方法实现
* 1）如何设计方法：方法参数，方法返回值
*     boolean   fun（ int year）
* 2）如何判断
*    四年以润，百年不润
*    四百年以润
*
*     year%4==0 &&year%100！=0   || year%400==0
* */

class YearFuncton{
      boolean fun(int year){
        boolean flag=false;
        if(year%4==0&&year%100!=0 || year%400==0){
            flag=true;
        }
        return flag;
    }

}