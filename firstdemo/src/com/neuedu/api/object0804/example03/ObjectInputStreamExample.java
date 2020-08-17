package com.neuedu.api.object0804.example03;

import java.io.*;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 1 文件
         * 2  文件输入字节流
         * 3   对象输入流
         * 4 提取数据
         *
         * 5 关闭
         *
         */

        File file=new File("text04.txt");
        if(!file.exists()){
            System.out.println("文件不存在，不能读取数据");
            return ;
        }

        FileInputStream fis=new FileInputStream(file);

        ObjectInputStream ois=new ObjectInputStream(fis);

        Student student1 = (Student) ois.readObject();
        Student student2=(Student) ois.readObject();

        System.out.println(student1);
        System.out.println(student2);

        ois.close();
        fis.close();

    }
}
