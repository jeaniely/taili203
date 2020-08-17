package com.neuedu.api.object0731.entry;

import java.util.ArrayList;
import java.util.List;

/**
 * 一副牌的生成
 */
public class PackOfCard {
   private List<Card> packOfCardList;

   public PackOfCard(){
       this.packOfCardList=setPackOfCardList();
   }
   private List<Card> setPackOfCardList(){
       String[] suids={"红桃","黑桃","方片","梅花"};
       String[] faces={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
       List<Card> list=new ArrayList<>();
       for(int i=0;i<suids.length;i++){
           for(int j=0;j<faces.length;j++){
               Card card=new Card(suids[i],faces[j]);
               list.add(card);
           }
       }
       return list;

   }

    public List<Card> getPackOfCardList() {
        return packOfCardList;
    }
}
