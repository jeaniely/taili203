package com.neuedu.api.object0806.thread02;

/**
 *   生产者，
 */
public class Producer extends  Thread {

    private Storage storage;
    public Producer(Storage storage){
        this.storage=storage;
    }

    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            storage.produce(String.valueOf(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
