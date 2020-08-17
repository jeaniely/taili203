package com.neuedu.api.object0806.thread01;

public class TickerExample implements Runnable  {
    private Object obj;
    private Integer tickersum;
    public TickerExample(Object obj,Integer tickersum){
        this.obj=obj;
        this.tickersum=tickersum;
    }


    @Override
    public  void run() {
        while(true) {
            if (tickersum > 0) {
                synchronized(obj){
                    if(tickersum>0){
                       System.out.println("买票：" + tickersum+ "  售卖点："+Thread.currentThread().getName());
                       tickersum--;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("票已卖完！");
                break;
            }
        }
    }
}
