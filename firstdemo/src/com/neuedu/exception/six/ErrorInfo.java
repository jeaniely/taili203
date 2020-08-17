package com.neuedu.exception.six;

public enum  ErrorInfo {
    OK(0,"成功"),
    UERNAME_OR_PASSWORD_ERR(1,"用户名或密码有误"),
    UER_NOT_LOGIN_ERR(2,"用户未登录");


    private int code;
    private String information;
    private ErrorInfo(int code,String information){
        this.code=code;
        this.information=information;
    }

    public int getCode() {
        return code;
    }

    public String getInformation() {
        return information;
    }
}
