package com.neuedu.api.object0727.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        //Date
        Date date=new Date(5000);
        System.out.println(date);
        System.out.println("年："+(date.getYear()+1900));
        System.out.println("月："+date.getMonth());
        System.out.println("毫秒数："+date.getTime());
        System.out.println("==========================================");
        // Calendar类
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println("***************************");
        calendar.setTime(date);
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println("=====================================");
        //时间|日期字符串转为 日期类型
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strdate="2020-07-21 14:24:06";
        try {
            Date date1=sdf.parse(strdate);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 日期类型转为为字符串，字符串的格式就是要求输出的格式

        String strdate1=sdf.format(date);
        System.out.println(strdate1);

        System.out.println("==================================");
        System.out.println(DateToString.getStringByDate(date));
        System.out.println(DateToString.getDateByString("2020-08-12 10:25:25"));
        System.out.println("==================================");

        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dateFormat1=DateFormat.getDateInstance();


    }
}
