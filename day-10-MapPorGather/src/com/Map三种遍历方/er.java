package com.Map三种遍历方;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/7 22:12
 */
public class er {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式


        //1.创建Map集合的对象
        Map<String,String> m = new HashMap<>();
        //2.添加元素
        m.put("伊志平","小龙女");
        m.put("郭靖","黄蓉");
        m.put("欧阳克","暗暗");
        //3.Map集合的第二种遍历方式
        //3.1 通过一个方法获取所有的键值对对象,返回一个Set集合
        Set<Map.Entry<String, String>> entries = m.entrySet();
        //3.2 遍历entries这个集合，去得到里面的每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //3.3 利用entry调用get方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +"="+value);
        }

        System.out.println("------------------------------------------");

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key +"="+value);
        }

        System.out.println("------------------------------------------");

        entries.forEach((Map.Entry<String, String> stringStringEntry) ->{
                String key = stringStringEntry.getKey();
                String value = stringStringEntry.getValue();
                System.out.println(key +"="+value);
            }
        );
    }
}
