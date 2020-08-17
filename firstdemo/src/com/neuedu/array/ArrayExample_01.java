package com.neuedu.array;

import java.util.Random;

public class ArrayExample_01 {
    /**
     *  数组的赋值，输出
     * @param args
     */
    public static void main(String[] args) {
        int[] array=new int[10];
       // array[2]=34;
        /*使用随机数赋值数组*/
        Random random=new Random();/*随机类*/
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
        }

//        输出
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+"   ");
        }
        System.out.println();
        System.out.println("============================");
       for(int k:array){
           System.out.print(k+"   ");
       }
    }
}
