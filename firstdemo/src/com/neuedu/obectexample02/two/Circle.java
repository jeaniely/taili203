package com.neuedu.obectexample02.two;

public class Circle extends Shape {
/*
* Circle表示圆类，增加1个属性，radius表示半径，
* 重写getPer、getArea和showAll三个方法，
* 另外又增加两个参数构造方法（为半径、颜色赋值的）。
* */

private  double radius;
public Circle(double radius,String color){
    super(color);
    this.radius=radius;
}

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPer() {
        return 2*3.14*radius;
    }

    @Override
    public void showAll() {
        /*System.out.println("圆类的颜色："+getColor()+" 半径："+radius+" 面积："+getArea()+" 周长："+getPer());*/
        System.out.printf("圆类的颜色：%s 半径：%.2f 面积：%.2f 周长：%.2f",getColor(),radius,getArea(),getPer());
    }
}
