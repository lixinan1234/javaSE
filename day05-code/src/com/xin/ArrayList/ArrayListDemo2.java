package com.xin.ArrayList;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/7 17:39
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        //1.定义一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加字符串
        list.add("元素1");
        list.add("元素2");
        list.add("元素3");



        //创建一个StringJoiner的对象
        StringJoiner sj = new StringJoiner(",","[","]");
        //3.遍历
        for (int i = 0; i < list.size(); i++) {
            //获取每一个元素
            String s = list.get(i);
            sj.add(s);
        }
        System.out.println(sj);











    }
}
