package com.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/8 20:51
 */
public class TreeMap1 {
    public static void main(String[] args) {
        /*
        需求1：
        键：整数表示id
        值：字符串表示商品名称
        要求：按照id的升序排序，按照id的降序排序
         */

        //1.创建TreeMap集合
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        //2.添加键值对元素
        tm.put(3,"牛奶");
        tm.put(8,"饼干");
        tm.put(1,"面包");
        tm.put(5,"水果");
        //3.排序
        System.out.println(tm);
    }
}
