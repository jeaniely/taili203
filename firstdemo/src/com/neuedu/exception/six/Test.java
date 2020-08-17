package com.neuedu.exception.six;

public class Test {
    /**
     * 1) 使用枚举类实现错误汇总，包含，错误代号，错误信息
     * 2） 自定义异常的时候：传入的是枚举类型的对象
     * 3)  使用对象对结果进行处理
     * 4） 最后调用的时候，一定处理异常，也就是说使用捕获异常来处理
     *     try-catch-finally
     * @param args
     */
    public static void main(String[] args) {
        /*假定，用户名输入错误*/

        OutputObject outputObject=null;

        try {
            throw new MyException(ErrorInfo.UERNAME_OR_PASSWORD_ERR);
        }catch (MyException e){
            /*System.out.println(e.getErrorInfo().getInformation());*/

            outputObject=new OutputObject(e.getErrorInfo().getCode(),e.getErrorInfo().getInformation());

        }


        System.out.println(outputObject.getCode()+"  "+outputObject.getError());

    }
}
