package com.TreeMap;

import java.util.TreeMap;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/8 21:17
 */
public class TreeMap3 {
    public static void main(String[] args) {
        /*
        需求：
        字符串"aabbabbccdabdcadcb"
        请统计字符串中每个字符出现的次数，并按照一下格式输出
        输出结果：
        a(5) b(6) c(4) d(3)
         */

        //1.定义字符串
        String s = "aabbabbccdabdcadcb";

        //2.创建集合
        TreeMap<Character,Integer> tm = new TreeMap<>();

        //2.遍历字符串得到里面的每一个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(tm.containsKey(c)){
                int count = tm.get(c);
                count++;
                tm.put(c,count);
            }else {
                tm.put(c,1);
            }

        }
        //3.遍历集合，并按照指定格式进行拼接
        //a(5) b(6) c(4) d(3)
        StringBuilder sb = new StringBuilder();
        tm.forEach(( key,  value)-> sb.append(key).append("(").append(value).append(")"));
        System.out.println(sb);
    }
}
