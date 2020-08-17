package com.neuedu.objectexample.four;

public class FactoryA implements FactoryMethod {

    @Override
    public Product create() {
        return new ProductA();
    }
}
