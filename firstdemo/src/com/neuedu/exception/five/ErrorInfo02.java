package com.neuedu.exception.five;

public enum  ErrorInfo02 {
    OK(200){
        @Override
        public String getInformation() {
            return "成功";
        }
    },
    REQUEST_ERR(404){
        @Override
        public String getInformation() {
            return "页面没有找到";
        }
    };


    private int code;
    private ErrorInfo02(int code){
        this.code=code;
    }

    public int getCode() {
        return code;
    }
    public abstract String getInformation();

}
