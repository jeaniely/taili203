package com.neuedu.api.object0728.three;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Goods> goodsList=new ArrayList<>();
        GoodsController.addGoods(goodsList,3);
        System.out.println(goodsList);
        String name="水";
        /*int index=GoodsController.findGoogsByName(goodsList,name);
        if(index==-1){
            System.out.println("没有此商品");
        }else{
            System.out.println(goodsList.get(index));
        }*/

       /* Goods goods=GoodsController.deleteGoodsByName(goodsList,name);
        System.out.println(goods);
        System.out.println(goodsList);*/

       GoodsController.updateGoodsByName(goodsList,name);
        System.out.println(goodsList);


    }
}
