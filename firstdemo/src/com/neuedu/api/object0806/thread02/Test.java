package com.neuedu.api.object0806.thread02;

/**
 * 1: wait、notify、notifyAll方法使用
 * 2：Object类提供这些方法
 * 3：可能产生：死锁
 * 4：与同步一起使用： synchronized
 *
 */
public class Test {
    public static void main(String[] args) {
        Storage storage=new Storage();
        Producer producer=new Producer(storage);
        Consumer consumer=new Consumer(storage);

        producer.start();
        consumer.start();
    }
}
