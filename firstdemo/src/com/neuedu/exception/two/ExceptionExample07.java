package com.neuedu.exception.two;

import java.io.IOException;

public class ExceptionExample07 {
    public static void main(String[] args) throws IOException {
        String str=null;
        if(str==null){
            throw new NullPointerException("这是空的");/*RuntimeException,不可检查异常*/
        }else if(str.equals("neuedu")){
            throw new IOException("相同字符串");/*检查异常，需要处理*/
        }
    }
}
