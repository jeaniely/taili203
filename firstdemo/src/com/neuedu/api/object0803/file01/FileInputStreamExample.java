package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    /**
     * 字节的输入
     * 读取
     * @param args
     */


    public static void main(String[] args) {
        File file=new File("text.txt");
        if(!file.exists()){
            System.out.println("文件不存在，不能读取");
            return;
        }

        //输入流

        FileInputStream fis=null;

        try {
            fis=new FileInputStream(file);

           int result1= fis.read();
            System.out.println(result1);

             /*int b=fis.read();
            System.out.println((char)b);*/
             byte[] b=new byte[50];
             int length=fis.read(b);
            System.out.println(new String(b,0,length));
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
