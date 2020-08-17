package com.neuedu.api.object0805.thread;

public class Test {
    /**
     * 实现线程：
     * 1）继承Thread类
     * 2) 实现Runnable接口
     */

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();

        for(int i=1;i<=10;i++){
            System.out.println("main:"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
