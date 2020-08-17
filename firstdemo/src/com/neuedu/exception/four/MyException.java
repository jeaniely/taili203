package com.neuedu.exception.four;

public class MyException extends  RuntimeException {
    private String message;
    public MyException(){}
    public MyException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
