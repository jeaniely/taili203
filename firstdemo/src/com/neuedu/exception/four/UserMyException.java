package com.neuedu.exception.four;

public class UserMyException {
    public static void checkString(String str){
        if(str==null){
            throw  new MyException("空字符串");
        }else if("neuedu".equals(str)){
            throw  new MyException("字符等等");
        }
    }
}
