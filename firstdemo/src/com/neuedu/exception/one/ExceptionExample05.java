package com.neuedu.exception.one;

public class ExceptionExample05 {
    public static void main(String[] args) {
        int[] array=new int[5];
        try {
            array[5] = 89;
            System.exit(0);
        }catch (NullPointerException e){
            System.out.println("NullPointException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("下标越界");
        }catch(RuntimeException e){
            System.out.println("RuntimeException");
        }catch(Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("无论上面的异常是否发生都要执行此语句");
        }
        System.out.println("继续执行");
        /*
        * final 、finally
        * */
    }

}
