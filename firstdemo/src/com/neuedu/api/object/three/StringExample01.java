package com.neuedu.api.object.three;

public class StringExample01 {
    public static void main(String[] args) {
        /**
         * 电话号码：136-0205-0405
         *    显示：13602050405
         *    1) 进行分割，使用-
         *    2）合并
         */

        String str="136-0205-0405";
        String[] strings=str.split("-");
        for(String s:strings){
            System.out.println(s);
        }

        StringBuilder sb=new StringBuilder();
        for(String s:strings){
            sb.append(s);
        }
        System.out.println(sb.toString());

    }
}
