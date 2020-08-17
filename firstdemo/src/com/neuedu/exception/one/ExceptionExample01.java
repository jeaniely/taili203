package com.neuedu.exception.one;

import java.io.File;

public class ExceptionExample01 {
    /*不建议其类名是使用系统自带的类型*/
    public static void main(String[] args) {

        /*运行时异常，非检查型异常*/
        int[] array=new int[5];

        array[5]=89;

        System.out.println("继续执行");
        /*非运行时的异常，检查型异常---处理*/
        /*File file =new File("d:/test.txt");

        if(file.exists()){
            file.delete();
        }else{
            file.createNewFile();
        }*/




    }
}
