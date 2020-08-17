package com.neuedu.obectexample02.one;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("benz","block");
        vehicle.setSpeed(100);
        vehicle.run();

        Car car=new Car("Honda","red",2);
        car.setSpeed(60);
        car.run();
    }
}
