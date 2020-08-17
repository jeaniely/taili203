package com.neuedu.objectexample.six;

import java.util.Scanner;

public class Gardener {
    public static Fruit create(){/*使用接口作为返回类型，多态使用*/
        Scanner scanner= new Scanner(System.in);
        System.out.println("这有苹果、香蕉、葡萄");
        String name=scanner.next();
        if(name.equals("苹果")||name.equals("Apple")){/*字符串值的比较使用equals*/
            return new Apple();
        }else if(name.equals("香蕉")){
            return new Banana();
        }else if(name.equals("葡萄")){
            return new Grape();
        }
        return null;
    }
}
