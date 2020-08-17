package com.neuedu.objectexample.five;

public class Factory03 implements AbstractFactory {
    @Override
    public ProductA createA() {
        return new ProductA3();
    }

    @Override
    public ProductB createB() {
        return new ProductB3();
    }
}
