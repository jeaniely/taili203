package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    /**
     * 使用字节存储数据
     * 输出，写
     * @param args
     */
    public static void main(String[] args) {
        //输出，文件存在
        File file=new File("text.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 输出流生成

        FileOutputStream fos=null;

        try {
            fos=new FileOutputStream(file);
            //将数据输出到文件中
            fos.write(45);//整型输入

            fos.write("hello student".getBytes());
            fos.flush();

            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
