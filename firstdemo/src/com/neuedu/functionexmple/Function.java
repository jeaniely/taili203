package com.neuedu.functionexmple;

import java.util.Scanner;

public class Function {
    /*
    * 模拟：超市买东西，打印小票
    *       XXXXX超市
    * ---------------------------
    * 商品  数量  单价   总计
    * 铅笔    2     2     4
    * 杯子    1     30     30
    * -----------------------
    * 总付款：34
    *
    * 案例分析思路：
    * 1）有商品
    *    商品名 String[] name;
    *    商品单价 double[] price;
    *    库存     int[] number
    * 2) 购物车
    *    商品名：String[] cartName
    *     数量：int[] cartNum
    *  3) 每个商品的总价格 ：double[] namePrices
    *     总付款：double sumPrice
    *
    * 4） 打印小票
    *
    *
    * */

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        nemu();

    }

    public static void nemu(){
        String name[]=new String[5];
        int[] number=new int[5];
        double[] price=new double[5];
        String[] cartName=new String[5];
        int[] cartNum=new int[5];
        int num=0;

        while(true) {
            System.out.println("1.商品添加");
            System.out.println("2.商品显示");
            System.out.println("3.购物");
            System.out.println("4.打印小票");
            System.out.println("5.退出");
            int n=scanner.nextInt();
            while(n<=0||n>5){
                System.out.println("重现输入命令");
                n=scanner.nextInt();
            }
            if(n==1) {
                GoodsCtroller.init(name, number, price);
            }else if(n==2) {
                GoodsCtroller.printGoodsInfomation(name, number, price);
            }else if(n==3) {

                num = GoodsCtroller.inputCart(cartName, cartNum);
            }else if(n==4) {
                /*  System.out.println(num);*/
                GoodsCtroller.printCartInformation(name, number, price, cartName, cartNum, num);
            }else if(n==5){
                System.out.println("退出系统");
                break;
            }
        }
    }



}
