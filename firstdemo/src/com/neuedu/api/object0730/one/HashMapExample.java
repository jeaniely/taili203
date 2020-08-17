package com.neuedu.api.object0730.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    /**
     * HashMap
     * 1) 允许key，value值为null
     * 2）如果key相同，value不同，系统保存最后一次的赋值
     * 3） 不同步，线程不安全，适合单线程
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("001","zhang");
        hashMap.put("002","li");
        hashMap.put(null,null);
        hashMap.put("002","wu");
        System.out.println(hashMap);
        System.out.println("================================");
        //先得到key值，在得到value值
        Set<String> keys=hashMap.keySet();//获取所有的key值
        for(String k:keys){
            System.out.println(k+"   "+hashMap.get(k));//通过key值得到value
        }
        System.out.println("================================");
        // key,value 存放在一个实体类中:Map.Entry
        Set<Map.Entry<String,String>> entries=hashMap.entrySet();
        for(Map.Entry<String,String> e:entries){
            System.out.println(e.getKey()+"  "+e.getValue());
        }
        System.out.println("===================================");
        //lambda
        hashMap.forEach((k,v)-> System.out.println(k+"  "+v));

    }
}
