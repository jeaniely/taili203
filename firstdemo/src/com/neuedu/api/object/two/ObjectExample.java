package com.neuedu.api.object.two;

public class ObjectExample {
    /**
     *
     * byte short int long float double boolean char
     * Byte Short Integer Long Float Double Boolean Character
     *
     * 1：在实体类中，定义成员变量的时候，建议使用包装类
     *  如：int 默认0  项目中设置中 0 特殊用法， 0 1 2
     *      没有考虑好，不设置，有默认的，及直接设置0.
     *      包装类：Integer null
     *
     * 2：基本数据类型和包装类如何转换
     *    自动装箱
     *    自动拆箱
     * 3: 字符串转为成基本数据类型/包装类
     *
     *
     *
     */

    public static void main(String[] args) {
        int int1=12;
        Integer it1=int1;//自动装箱
        int int2=it1;//自动拆箱

        // 字符串--》基本数据类型
        String strnumber="123456";//数字型字符串

        int int3=Integer.parseInt(strnumber);


        // 字符串--》包装类
        Integer it2= new Integer(strnumber);
        Integer it3=Integer.valueOf(strnumber);

        System.out.println(it2.equals(it3));
        System.out.println(it2==it3);

        System.out.println("=====================");

        Integer it4=127;
        Integer it5=127;
        Integer it6=128;
        Integer it7=128;
        System.out.println(it4==it5);
        System.out.println(it6==it7);

       /* Double do1;*/
    }


}
