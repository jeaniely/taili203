package com.neuedu.functionexmple;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class GoodsCtroller {

    private static Scanner scanner=new Scanner(System.in);

    /**
     * 商品的输入---数组的输入
     * @param name  商品名
     * @param number 库存
     * @param price 单价
     */
    public static void init(String[] name,int[] number,double[] price){
        for(int i=0;i<name.length;i++){
            System.out.println("第"+(i+1)+"商品信息输入：");
            System.out.println("商品名");
            name[i]=scanner.next();
            System.out.println("库存");
            number[i]=scanner.nextInt();
            System.out.println("单价");
            price[i]=scanner.nextInt();
        }
    }

    /**
     *  商品的输出---数组的输出
     * @param name
     * @param number
     * @param price
     */
    public static void printGoodsInfomation(String[] name,int[] number,double[] price){

        System.out.println("商品名\t库存\t单价");
        for(int i=0;i<name.length;i++){

            System.out.println(name[i]+"\t"+number[i]+"\t"+price[i]);
        }
    }

    /**
     * 购物车添加商品
     * @param cartName  商品名
     * @param cartNum   购物数量
     * @return  几种商品
     */

    public static int inputCart(String[] cartName,int[] cartNum){
        int num=0;
        for(;;){
            System.out.println("第"+(num+1)+"购物商品信息输入：");
            System.out.println("商品名");
            cartName[num]=scanner.next();
            System.out.println("数量");
            cartNum[num]=scanner.nextInt();
            num++;

            if(num==cartName.length){
                System.out.println("购物车已满");
                break;
            }

            System.out.println("是否继续购物？（任意键继续购物，0不在购物）");
            int k=scanner.nextInt();
            if(k==0){
                System.out.println("结束购物");
                break;
            }
        }
        return num;
    }

    /**
     * 每个商品的合计
     * @param name
     * @param number
     * @param price
     * @param cartName
     * @param cartNum
     * @param num
     * @param namePrices
     */
    private static void computerPrice(String[] name,int[] number,double[] price,String[] cartName,int[] cartNum,int num,double[] namePrices){
        /*
        * 1)  库存减少
        * 2）计算每种商品的合计
        * */
        for(int i=0;i<num;i++){//购物车中商品

            for(int j=0;j<name.length;j++){//商品
                if(cartName[i].equals(name[j])){
                    number[j]-=cartNum[i];
                    namePrices[i]=cartNum[i]*price[j];
                }
            }

        }

    }

    /**
     * 总的付款数
     * @param num
     * @param namePrices
     * @return
     */
    private  static double sumPrice(int num,double[] namePrices){
        double sum=0;
        for(int i=0;i<num;i++){
            sum+=namePrices[i];
        }
        return sum;
    }

    public static void printCartInformation(String[] name,int[] number,double[] price,String[] cartName,int[] cartNum,int num) {
        double[] namePrices=new double[num];
        computerPrice(name,number,price,cartName,cartNum,num,namePrices);

        double sumPrice=sumPrice(num,namePrices);

        System.out.println("\t惠友超市");
        System.out.println("----------------------------");
        System.out.println("商品名\t数量\t单价\t合计");
        for(int i=0;i<num;i++){
            System.out.print(cartName[i]+"\t"+cartNum[i]+"\t");
            for(int j=0;j<name.length;j++){
                if(name[j].equals(cartName[i])){
                    System.out.print(price[j]+"\t");
                    break;
                }
            }
            System.out.println(namePrices[i]);

        }
        System.out.println("----------------------------");
        System.out.println("总付款："+sumPrice);

    }

    }
