package com.neuedu.api.object0806.thread02;

import java.util.LinkedList;

public class Storage {
    private final int MAX_NUMBER=10;
    private LinkedList<String> query=new LinkedList<>();


    public void produce(String i){
      synchronized (query) {
          while (query.size()==MAX_NUMBER){
              System.out.println("仓库已满");
              try {
                  query.wait();//等待消费者唤起
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

              try {
                  Thread.sleep(100);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
          System.out.println("生成汉堡：" + i);
          query.add(i);
          query.notifyAll();//唤醒的消费者
      }
    }

   public String consumer(){
        synchronized (query) {
            while (query.size()==0){
                System.out.println("仓库已空");
                try {
                    query.wait();//等待生产者唤起
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String s = query.removeFirst();
            System.out.println("消费汉堡：" + s);
            query.notifyAll();//唤醒的生产者
            return s;
        }
   }

}
