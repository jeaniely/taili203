package com.neuedu.obectexample02.one;

public class Car extends Vehicle {
    private int loader;
    public Car(String brand,String color,int loader){
        super(brand,color);
        this.loader=loader;
    }

    @Override
    public void run() {
        System.out.println("汽车的品牌："+super.getBrand()+" 颜色："+getColor()+" 速度："+getSpeed()+" 载客人数："+loader);
    }
}
