package com.neuedu.api.object.three;

public class Test {
    /**
     *  1：字符串类
     *    不可变字符串类：String
     *               字符不可变原因：final char value[];
     *                类不能被继承： final class String
     *
     *    可变字符串类：StringBuffer                           StringBuilder
     *          版本：   1.0                                     1.5
     *        线程安全性： 线程安全，适合于多线程实现    线程不安全，适合于单线程
     *          性能：      低                               性能高
     *
     * 2： 案例1： 比较两个字符串
     *     案例2： 电话号码：136-0205-0405
     *             显示：13602050405
     *
     *     案例3：http://www.baidu.com/list.do
     *         提取地址中的list.do
     *
     */
    public static void main(String[] args) {
        String str;
        StringBuilder sb;
        StringBuffer sbf;
    }
}
