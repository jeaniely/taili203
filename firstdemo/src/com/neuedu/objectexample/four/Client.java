package com.neuedu.objectexample.four;

public class Client {
    public static void main(String[] args) {
        FactoryMethod factory=new FactoryC();
        Product product=factory.create();
        product.operation01();
        product.operation02();
    }
}
