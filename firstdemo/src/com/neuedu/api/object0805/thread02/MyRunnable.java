package com.neuedu.api.object0805.thread02;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<=10;++i){
            System.out.println("thread:"+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
