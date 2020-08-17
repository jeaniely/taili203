package com.neuedu.exception.one;

public class ExceptionExample04 {
    public static void main(String[] args) {
        int[] array=new int[5];
        try {
            array[4] = 89;
            return;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("下标越界");
        }finally {
            System.out.println("无论上面的异常是否发生都要执行此语句");
        }
        System.out.println("继续执行");
    }
}
