package com.练习;

import java.util.*;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/11 21:28
 */
public class test4 {
    public static void main(String[] args) {
        /*
        需求：
        定义一个Map集合，键用表示省份名称province,值表示市city,但市会有多个
        添加完毕后，遍历结果格式如下：
        江西省 = 上饶市，新余市，赣州市，吉安市
         */

        //1.创建一个Map集合
        HashMap<String, ArrayList> map = new HashMap<>();
        //2.创建一个list集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "上饶市", "新余市", "赣州市", "吉安市");
        //2.创建一个list集合
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "南京市", "扬州市", "苏州市", "无锡市");
        //3.添加map集合元素
        map.put("江西省", list);
        map.put("江苏省", list2);
        //4.遍历

        Set<Map.Entry<String, ArrayList>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",","","");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key+" = "+sj);
        }
    }
}
