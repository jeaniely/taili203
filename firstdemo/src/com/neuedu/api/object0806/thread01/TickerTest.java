package com.neuedu.api.object0806.thread01;

public class TickerTest {
    public static void main(String[] args) {
        TickerExample tickerExample=new TickerExample(new Object(),20);
        Thread thread1=new Thread(tickerExample,"手机");
        Thread thread2=new Thread(tickerExample,"火车站窗口");
        Thread thread3=new Thread(tickerExample,"代售点");


        thread1.start();
        thread2.start();
        thread3.start();
    }
}
