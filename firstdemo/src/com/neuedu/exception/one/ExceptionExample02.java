package com.neuedu.exception.one;

public class ExceptionExample02 {
    /**
     * 捕获异常处理
     *
     * try{
     *     可能发生异常的代码
     * }catch（异常参数）{
     *     处理
     * }
     * @param args
     */
    public static void main(String[] args) {
        int[] array=new int[5];
        try {
            array[5] = 89;
        }catch (ArrayIndexOutOfBoundsException e){
            /*e.printStackTrace();*/
           /* System.out.println(e.getMessage());*/
            System.out.println("下标越界");
        }

        System.out.println("继续执行");
    }
}
