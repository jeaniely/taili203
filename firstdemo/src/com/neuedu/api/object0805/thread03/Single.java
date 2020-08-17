package com.neuedu.api.object0805.thread03;

public class Single {
    private Single(){
        System.out.println("创建了一个实例");
    }
    private static Single instance;
    public synchronized static Single getInstance(){
        if(instance==null){
            /*synchronized (Single.class) {
                if(instance==null) {
                    instance = new Single();
                }
            }*/
            instance=new Single();
        }
        return instance;
    }
}
