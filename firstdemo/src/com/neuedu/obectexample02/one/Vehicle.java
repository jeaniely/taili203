package com.neuedu.obectexample02.one;

public class Vehicle {
    private String brand;
    private String color;
    private double speed;

    public Vehicle(String brand,String color){
        this.brand=brand;
        this.color=color;
    }

    public String getBrand() {
        return brand;
    }

/*
    public void setBrand(String brand) {
        this.brand = brand;
    }
*/

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void run(){
        System.out.println("汽车的品牌："+brand+" 颜色："+color+" 速度："+speed);
    }



}
