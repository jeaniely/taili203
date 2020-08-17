package com.neuedu.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample_02 {
    /**
     *  数组中插入数值
     *   数组：9个数
     *   通过输入插入的位置和值
     *     进行插入
     * @param args
     */
    public static void main(String[] args) {
        int[] a=new int[10];
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<a.length-1;i++){//9个元素
            a[i]=random.nextInt(100);
        }
        System.out.println("插入前输出数组：");
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+"   ");
        }
        /*插入的位置和值*/
        System.out.println("插入的位置");
        int k=scanner.nextInt();
        System.out.println("插入的值");
        int n=scanner.nextInt();

        if(k<=0 || k>a.length){
            System.out.println("输入的位置有误");
        }else {
            for(int last=a.length-2;last>=k-1;last--){
                a[last+1]=a[last];
            }

            a[k-1]=n;

        }

        /*插入的数组进行输出*/

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"   ");
        }


    }
}
