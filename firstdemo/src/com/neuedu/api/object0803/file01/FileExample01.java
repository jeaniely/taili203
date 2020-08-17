package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.IOException;

public class FileExample01 {
    public static void main(String[] args) {
        File file=new File("D:/demo/text.txt");
        if(!file.exists()){
            try {
                file.createNewFile();//创建文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("文件是否存在"+file.exists());
        System.out.println("文件名："+file.getName());
        System.out.println("判断是否是文件："+file.isFile());
        System.out.println("路径："+file.getPath());
        System.out.println("绝对路径"+file.getAbsolutePath());
        System.out.println("文件大小："+file.length());
    }
}
