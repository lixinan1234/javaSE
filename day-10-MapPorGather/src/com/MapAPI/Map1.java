package com.MapAPI;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/7 17:00
 */
public class Map1 {
    public static void main(String[] args) {
        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();
        //2.添加元素
        map.put("郭靖","黄蓉");
        map.put("廖乐乐","张梦麟");
        map.put("李新安","小龙女");

        //删除
        //String remove = map.remove("郭靖");
        //System.out.println(remove);

        //清空
        //map.clear();

        //判断是否包含
        //boolean key = map.containsKey("郭靖");
        //System.out.println(key);
        //boolean value = map.containsValue("小龙女");
        //System.out.println(value);

        //判断集合是否为空
        boolean is = map.isEmpty();
        System.out.println(is);

        //集合的长度
        int size = map.size();
        System.out.println(size);


        //3.打印集合
        System.out.println(map);

        //
    }
}
