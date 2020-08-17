package com.neuedu.api.object0804.example02;

import java.io.*;

public class DataOutputStreamExample {
    /**
     * 基本数据类型+String存到文件中
     * @param args
     */
    public static void main(String[] args) throws IOException {
        /**
         * 1 创建文件
         *    如果有，找到文件
         * 2  生成文件字节输出流
         * 3   数据输出流
         * 4  存放数据
         * 5  关闭
         *
         */

        File file=new File("test02.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos=new FileOutputStream(file);

        DataOutputStream dos=new DataOutputStream(fos);

       dos.writeInt(12);
       dos.writeDouble(45.6);
       dos.writeUTF("hello");

       dos.flush();

       dos.close();
       fos.close();


    }
}
