package com.neuedu.api.object0804.example01;

import java.io.*;

public class BufferedInputOutputStreamExample {
    /**
     *  文件复制
     *  源文件：d:/demo/dir/timg.jfif
     *  复制到：d:/demo中
     * @param args
     */
    public static void main(String[] args) {
        /**
         *
         * 1提取数据
         * 1） 得到源文件
         * 2）字节输入流
         * 3）缓存输入流
         * 4）提取数据
         *
         * 2写入文件中
         * 1）新将文件，文件名与源文件名相同
         * 2） 字节输出流
         * 3） 缓冲输出流
         * 5） 写入写文件
         *
         * 3. 关闭
         *
         */

        File s=new File("D:/demo/dir/timg.jfif");
        if(!s.exists()){
            System.out.println("文件不存在，不能进行读取");
            return;
        }

        FileInputStream fis=null;
        BufferedInputStream bis=null;

        try {
            fis=new FileInputStream(s);
            bis=new BufferedInputStream(fis);

           // bis.read()

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        File d=new File("d:/demo",s.getName());
        if(!d.exists()){
            try {
                d.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileOutputStream fos=null;
BufferedOutputStream bos=null;

        try {
            fos=new FileOutputStream(d);
            bos=new BufferedOutputStream(fos);

            byte[] b=new byte[1024];
            int length=bis.read(b);
            while (length!=-1){
                bos.write(b,0,length);/*保证最后一个提取有效*/
                length=bis.read(b);
            }
            bos.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bos.close();
            bis.close();
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//   移动
       /* s.delete();*/

    }
}
