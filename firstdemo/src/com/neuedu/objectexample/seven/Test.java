package com.neuedu.objectexample.seven;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
      /*new  UseCompute().useCom(new Minus(),12,45);*/
        menu();
    }
    static Scanner scanner=new Scanner(System.in);
    public static void menu(){
        while (true) {
            System.out.println("1:加法");
            System.out.println("2:减法");
            System.out.println("3:乘法");
            System.out.println("4:除法");
            System.out.println("5:退出");
            int n = scanner.nextInt();
            Compute compute = null;
            if (n == 1) {
                compute = new Add();
            } else if (n == 2) {
                compute = new Minus();
            } else if (n == 3) {
                compute = new Multiply();
            } else if (n == 4) {
                compute = new Divide();
            }else if(n==5){
                System.out.println("退出系统");
                break;
            }


            System.out.println("输入第一个值：");
            int one = scanner.nextInt();
            System.out.println("输入第二个值：");
            int two = scanner.nextInt();

            new UseCompute().useCom(compute, one, two);
        }
    }
}
