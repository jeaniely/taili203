package com.neuedu.exception.five;

public enum ErrorInfo {
    OK(200,"成功"),
    REQUEST_ERR(404,"页面没有找到");

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

    public static String getInformation(int code) {
        for(ErrorInfo e:ErrorInfo.values()){
            if(e.getCode()==code){
                return e.getInformation();
            }
        }
       return null;
    }
}
