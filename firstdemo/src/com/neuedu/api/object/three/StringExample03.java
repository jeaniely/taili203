package com.neuedu.api.object.three;

public class StringExample03 {
    public static void main(String[] args) {
        String str="http://www.baidu.com/list.do";
        int beginindex=str.lastIndexOf("/");
        System.out.println(beginindex);
        int lastindex=str.lastIndexOf(".");
        System.out.println(lastindex);

        String strsub=str.substring(beginindex+1,lastindex);
        System.out.println(strsub);

    }
}
