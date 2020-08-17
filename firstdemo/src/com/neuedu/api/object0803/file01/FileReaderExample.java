package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        File file=new File("test01.txt");
        if(!file.exists()){
            System.out.println("文件不能读取！");
            return;
        }

        //字符输入流的创建

        FileReader reader=null;

        try {
            reader=new FileReader(file);

            int ch=reader.read();
            while(ch!=-1) {
                System.out.print((char) ch);
                ch=reader.read();
            }
           /* char[] chars=new char[30];
            reader.read(chars);*/

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
