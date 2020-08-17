package com.neuedu.api.object0727.math;

import java.math.BigDecimal;
import java.util.Random;

public class MathExample {
    public static void main(String[] args) {
        // Math类中
        //计算圆的面积
        double r=10;
        double area=Math.PI*Math.pow(r,2);
        System.out.println(area);
        System.out.println("================================");
        //求随机数
        double random=Math.random();//0<=x <1
        System.out.println(random);
        int ramdomint=((int)(random*1000))%101;
        System.out.println(ramdomint);
        System.out.println("============================");
        //Random类
        Random random1=new Random();
        int ramdomint1=random1.nextInt(101);
        System.out.println(ramdomint1);
        System.out.println("==================================");
        //price,在数据库中使用的数据类型时Decimal，对应在java中使用BigDecimal类
        // BigDecimal
        BigDecimal decimal=new BigDecimal(12);
        BigDecimal decimal1=new BigDecimal(12.5);
        System.out.println(decimal.add(decimal1));
        System.out.println(decimal.pow(2));




    }

}
