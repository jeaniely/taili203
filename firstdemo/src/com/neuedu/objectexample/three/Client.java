package com.neuedu.objectexample.three;

public class Client {
    public static void main(String[] args) {
        Product product=SimpleFactory.create("B");
        product.operation01();
        product.operation02();
    }
}
