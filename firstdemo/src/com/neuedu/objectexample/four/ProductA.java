package com.neuedu.objectexample.four;

public class ProductA implements Product {
    @Override
    public void operation01() {
        System.out.println("A1原材料");
    }

    @Override
    public void operation02() {
        System.out.println("A1产品");
    }
}
