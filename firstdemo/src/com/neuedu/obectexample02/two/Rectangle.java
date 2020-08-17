package com.neuedu.obectexample02.two;

public class Rectangle extends Shape {
/*
* *Rectangle表示矩形类，增加两个属性，Width表示长度、height表示宽度，
* 重写getPer、getArea和showAll三个方法，
* 另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）
*
* */

private  double width;
private double height;

public Rectangle(){}
public Rectangle(double height,double width,String color){
    super(color);
    this.height=height;
    this.width=width;
}
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPer() {
        return 2*(height+width);
    }

    @Override
    public void showAll() {
        System.out.println("矩形的颜色："+getColor()+" 长度："+width+" 高度："+height+" 面积："+getArea()+" 周长："+getPer());
    }
}
