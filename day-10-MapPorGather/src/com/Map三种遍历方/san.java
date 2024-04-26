package com.Map三种遍历方;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/7 22:30
 */
public class san {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式

        //1.创建Map集合的对象
        Map<String,String> m = new HashMap<>();
        //2.添加元素
        m.put("伊志平","小龙女");
        m.put("郭靖","黄蓉");
        m.put("欧阳克","暗暗");
        //3.利用lambda表达式进行遍历
        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s +"="+ s2);
            }
        });

    }
}
