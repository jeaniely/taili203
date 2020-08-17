package com.neuedu.api.object0803.file01;

import java.io.File;

public class FileExample02 {
    public static void main(String[] args) {
        File file=new File("D:\\demo\\dir");
        System.out.println("是否是目录："+file.isDirectory());
        System.out.println("路径："+file.getPath());
        System.out.println("名称："+file.getName());
        //输出目录中文件
        File[] files = file.listFiles();
        for(File f:files){
            System.out.println("---------------------------");
            System.out.println("是否是文件："+f.isFile());
            System.out.println("文件名："+f.getName());
            System.out.println("绝对路劲："+f.getAbsolutePath());
            System.out.println("文件大小："+f.length());
        }
    }
}
