package com.neuedu.api.object0727.uuid;

import java.util.Date;
import java.util.UUID;

public class UUIDExample {
    public static void main(String[] args) {
        /**
         * 1) 自定义
         *    A：规定每个字符的作用，有一部分是随机或者某种算法生成
         *    12061919990812012
         *    B：随机定义的
         *
         */
        String strid=new Date().getTime()+"";
        System.out.println(strid);
        System.out.println("===================================");

       String uuid= UUID.randomUUID().toString();
        System.out.println(uuid);

        String uuids=uuid.replace("-","");
        System.out.println(uuids);
    }
}
