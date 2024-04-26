package com.Map三种遍历方;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/7 21:52
 */
public class yi {
    public static void main(String[] args) {
        //Map的第一种遍历方式

        //1.创建Map集合的对象
        Map<String,String> m = new HashMap<>();

        //2.添加元素
        m.put("伊志平","小龙女");
        m.put("郭靖","黄蓉");
        m.put("欧阳克","暗暗");

        //3.通过键找值
        //3.1获取所有键，把这些键放到一个单列集合当中
        Set<String> keys = m.keySet();
        //3.2遍历单列集合，得到每一个键
        for (String key : keys) {
            //3.3利用Map集合中的键获取对应的值 get
            String s = m.get(key);
            System.out.println(key + "=" +s);

        }

    }
}
