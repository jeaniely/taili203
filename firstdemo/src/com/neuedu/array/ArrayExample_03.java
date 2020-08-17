package com.neuedu.array;

import java.util.Random;

public class ArrayExample_03 {
    public static void main(String[] args) {
        int[][] a=new int[4][4];
        /*System.out.println(a[0].length);*/
        Random random=new Random();

        for(int i=0;i<a.length;i++){//行变化
            for(int j=0;j<a[i].length;j++){//每行列的变化
                if(i>=j)
                a[i][j]=random.nextInt(100);
            }
        }

        for(int i=0;i<a.length;i++){//行变化
            for(int j=0;j<a[i].length;j++){//每行列的变化
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
