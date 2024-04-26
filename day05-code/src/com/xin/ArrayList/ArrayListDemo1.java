package com.xin.ArrayList;

import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/7 16:55
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.增（添加元素）
        list.add("我是帅哥");
        list.add("廖乐乐");
        list.add("他非常的帅");

        //3.删（删除元素）
//        list.remove("廖乐乐");
        //删除元素，并返回被删除的元素
        list.remove(2);


        //4.改（修改元素）
        String result = list.set(1, "李新安");
        System.out.println(result);

        //5.查（查询元素）
//        String s = list.get(1);
//        System.out.println(s);

        //输出
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            String s1 = list.get(i);
//            System.out.println(s1);
//        }
    }
}
