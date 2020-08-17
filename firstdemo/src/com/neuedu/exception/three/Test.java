package com.neuedu.exception.three;

public class Test {
    public static void main(String[] args) {
        String str=null;
        try {
            UserMyException.checkString(str);
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
