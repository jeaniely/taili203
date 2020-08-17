package com.neuedu.exception.three;

public class UserMyException {

    public static void checkString(String str) throws MyException {
        if(str==null){
            throw new MyException("空字符串");
        }else if("neuedu".equals(str)){
            throw  new MyException("字符相等异常");
        }
    }
}
