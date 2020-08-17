package com.neuedu.object.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*Goods goods=new Goods();
        goods.setGid("h0001");
        goods.setName("牙刷");
        goods.setPrice(12);
        goods.setUnitOfMeasurement("个");
        goods.setStock(200);
        System.out.println(goods);*/

        Goods[] goodsarray=new Goods[5];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<goodsarray.length;i++){
            goodsarray[i]=new Goods();
            System.out.println("输入第"+(i+1)+"件商品：");
            System.out.println("商品编号");
            goodsarray[i].setGid(scanner.next());
            System.out.println("商品名");
            goodsarray[i].setName(scanner.next());
            System.out.println("商品单价");
            goodsarray[i].setPrice(scanner.nextDouble());
            System.out.println("商品单位");
            goodsarray[i].setUnitOfMeasurement(scanner.next());
            System.out.println("库存");
            goodsarray[i].setStock(scanner.nextInt());
        }

     /*   for(int i=0;i<goodsarray.length;i++){
            System.out.println(goodsarray[i]);
        }
*/
     for(Goods g:goodsarray){
         System.out.println(g);
     }
    }
}
