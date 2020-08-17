package com.neuedu.function;

public class Funciton_01 {
    public static void main(String[] args) {
       /* Function function=new Function();
         int a=23,b=34;
        int sum=function.add(a,b);

        System.out.println(sum);*/

       int a=22;
       int[] b={45,78,23};
        System.out.println(a);
        for(int k:b){
            System.out.print(k+"  ");
        }

       new Function().fun(a,b);

        System.out.println();
        System.out.println("==================");

        System.out.println(a);
       for(int k:b){
            System.out.print(k+"  ");
        }
    }
}

class Function{
    /*两个整数数相加*/

    int add(int a,int b){
        return a+b;
    }

    void fun(int a,int[] b){
        a=45;
       /* b[0]=1;*///1:影响调用者
        b=new int[4];//2：不影响调用者
        b[0]=99;

    }


}