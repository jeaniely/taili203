package com.neuedu.api.object0731;

import com.neuedu.api.object0731.controller.CardsController;
import com.neuedu.api.object0731.entry.Card;
import com.neuedu.api.object0731.entry.PackOfCard;

import java.util.List;
import java.util.Scanner;

public class CardsTest {
    /**
     * 问题：1）如何比较多次
     *       2）下一次比较是新牌还是原来的牌
     * @param args
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){

        PackOfCard packOfCard=new PackOfCard();
        Scanner scanner=new Scanner(System.in);

        while(true) {

            List<Card> cardList = packOfCard.getPackOfCardList();
            CardsController.print(cardList);


            // 洗牌功能实现
            CardsController.shuffle(cardList);
            System.out.println("洗牌之后的数据");
           /* CardsController.print(cardList);*/


            //抽取
            Card personCard = null;
            //人的抽取
            personCard = CardsController.getPersonCard(cardList);
            System.out.println("人抽取的牌：" + personCard);

           /* CardsController.print(cardList);*/
            Card computerCard = null;
            //计算机抽取
            computerCard = CardsController.getComputerCard(cardList);
            System.out.println("计算机抽取的牌：" + computerCard);
            /*CardsController.print(cardList);*/


            // 出结果
            int result = CardsController.compare(computerCard, personCard);
            if (result == 1) {
                System.out.println("恭喜您赢了");
            } else {
                System.out.println("再接再厉");
            }

            if((52-cardList.size())/2==3){
                System.out.println("已经玩3次，结束");
                break;
            }
            System.out.println("是否继续：y|n");
            char ch=scanner.next().charAt(0);
            if(ch=='n'){
                System.out.println("游戏结束");
                break;
            }


        }
    }
}
