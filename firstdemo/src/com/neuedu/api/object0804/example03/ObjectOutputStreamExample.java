package com.neuedu.api.object0804.example03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        /**
         * 1 文件
         *
         * 2 文件输出字节流
         *
         * 3 对象输出流
         *
         * 4 保存对象
         *
         * 5 关闭
         */

        File file=new File("text04.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos=new FileOutputStream(file);

        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Student student1=new Student("zhang",18,new BigDecimal("89"));
        Student student2=new Student("li",18,new BigDecimal("85.6"));

        oos.writeObject(student1);
        oos.writeObject(student2);

        oos.flush();

        oos.close();
        fos.close();


    }
}
