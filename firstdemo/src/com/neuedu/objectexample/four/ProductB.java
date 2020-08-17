package com.neuedu.objectexample.four;

public class ProductB implements Product{
    @Override
    public void operation01() {
        System.out.println("B原材料");
    }

    @Override
    public void operation02() {
        System.out.println("B产品");
    }
}
