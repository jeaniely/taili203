package com.neuedu.api.object.three;

public class StringExample02 {
    public static void main(String[] args) {
        /**
         * http://www.baidu.com/list.do
         * A:提取地址中的list.do
         *
         * 1)提取字串，使用的方法
         * 2）提取的开始位置
         *
         * B:提取地址中的list
         *
         *
         */
        String str="http://www.baidu.com/list.do";
        int index=str.lastIndexOf("/");
        System.out.println(index);

        String strsub=str.substring(index+1);
        System.out.println(strsub);



    }
}
