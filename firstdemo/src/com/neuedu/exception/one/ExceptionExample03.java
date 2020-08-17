package com.neuedu.exception.one;

public class ExceptionExample03 {
    /**
     * 多个异常
     *
     * 同一级别：不分先后，随便写
     * 不同级别：先写的子类，再写父类
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array=new int[5];
        try {
            array[5] = 89;
        }catch (NullPointerException e){
            System.out.println("NullPointException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch(RuntimeException e){
            System.out.println("RuntimeException");
        }catch(Exception e){
            System.out.println("Exception");
        }
    }
}
