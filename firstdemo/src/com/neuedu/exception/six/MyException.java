package com.neuedu.exception.six;

public class MyException extends RuntimeException {
    private ErrorInfo errorInfo;
    public MyException(ErrorInfo errorInfo){
       this.errorInfo=errorInfo;
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }
}
