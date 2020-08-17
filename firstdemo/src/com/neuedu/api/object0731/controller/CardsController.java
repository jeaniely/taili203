package com.neuedu.api.object0731.controller;

import com.neuedu.api.object0731.entry.Card;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CardsController {

    private  CardsController(){}

    /**
     * 输出
     * @param cardList
     */
    public static void print(List<Card> cardList){
        System.out.println("这副牌的内容：");
        for(int i=0;i<cardList.size();i++){
            System.out.print(cardList.get(i)+"\t");
            if((i+1)%10==0){
                System.out.println();
            }
        }
        System.out.println();
    }

    /**
     * 洗牌
     * @param cardList
     */
    public static void shuffle(List<Card> cardList){
        Collections.shuffle(cardList);
    }

    /**
     * 人抽取纸牌
     * @param cardList
     * @return
     */
    public static Card getPersonCard(List<Card> cardList){
        Scanner scanner=new Scanner(System.in);
        System.out.println("抽取的数值的输入：(1-"+cardList.size()+")");
        int index=scanner.nextInt();

        while(index<1||index>cardList.size()){
            System.out.println("重新输入数值：");
            index=scanner.nextInt();
        }

        //抽取数值之后，删除lt中数据
       /* Card card=cardList.get(index-1);
        cardList.remove(index-1);*/

       return cardList.remove(index-1);
    }

    /**
     * 计算机抽取纸牌
     * @param cardList
     * @return
     */
    public static Card getComputerCard(List<Card> cardList){
        //随机抽取
        Random random=new Random();
        int index=random.nextInt(cardList.size())+1;//0-50 -->1-51

        return cardList.remove(index-1);

    }

    /**
     *  字符串转化为double
     * @param face
     * @return
     */
    private static double conver(String face){
        if("A".equals(face)){
            return 1;
        }else if("J".equals(face)||"Q".equals(face)||"K".equals(face)){
            return 0.5;
        }else{
            return Double.parseDouble(face);
        }
    }

    /**
     *  面值的比较
     * @param computer
     * @param person
     * @return
     */
    private static int faceCompare(double computer,double person){
        if(computer>person){
            return -1;
        }else if(computer<person){
            return 1;
        }else{
            return 0;
        }
    }

    /**
     * 花色比较
     * @param computer
     * @param person
     * @return
     */
    private static int suidCompare(String computer,String person){
        //红桃>黑桃>方片>梅花
        if("红桃".equals(computer)&&("黑桃".equals(person)||"方片".equals(person)||"梅花".equals(person))){
            return -1;
        }else if("黑桃".equals(computer)&&("方片".equals(person)||"梅花".equals(person))){
            return -1;
        }else if("方片".equals(computer)&&"梅花".equals(person)){
            return -1;
        }else{
            return 1;
        }


    }

    public static int compare(Card computer,Card person){
        //比较的面值
        int facecom=faceCompare(conver(computer.getFace()),conver(person.getFace()));
        if(facecom==0){//面值相等的时候，计较花色
            int suidscom=suidCompare(computer.getSuid(),person.getSuid());
            return suidscom;
        }else{
            return facecom;
        }
    }


}
