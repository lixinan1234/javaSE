package com.LinkedHashMap;

import java.util.LinkedHashMap;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/8 20:38
 */
public class map1 {
    public static void main(String[] args) {
        //1.创建集合
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        //2.添加元素
        lhm.put("b",345);
        lhm.put("a",123);
        lhm.put("a",111);
        lhm.put("c",678);
        //3.打印集合
        System.out.println(lhm);
    }
}
