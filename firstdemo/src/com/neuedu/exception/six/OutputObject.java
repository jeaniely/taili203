package com.neuedu.exception.six;

public class OutputObject<T> {
    private int code;
    private  String error;
    private T data;

    public OutputObject(int code,String error){
        this.code=code;
        this.error=error;
    }

    public OutputObject(int code,T data){
        this.code=code;
        this.data=data;
    }

    public int getCode() {
        return code;
    }

    public String getError() {
        return error;
    }

    public T getData() {
        return data;
    }
}
