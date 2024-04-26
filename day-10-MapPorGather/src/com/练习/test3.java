package com.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/11 20:52
 */
public class test3 {
    public static void main(String[] args) {
        /*
        班级里有n个学生
        要求：
        被点到的学生不会再点到
        但是如果班级中所有的学生都被垫完了，需要重新开启第二轮。
         */

        //1.定义集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        Collections.addAll(list, "张角", "吕布", "赵云", "诸葛亮", "刘备");
        //创建一个临时的集合，用来存已经被点到学生名字
        ArrayList<String> list2 = new ArrayList<>();



        //外循环：表示轮数
        for (int j = 0; j < 10; j++) {
            System.out.println("===========第"+j+"轮开始了====================");
            //3.获取集合的长度
            int count = list.size();
            //4.随机点名
            Random r = new Random();
            //内循环：表示每轮循环抽取的过程
            for (int i = 0; i < count; i++) {
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            //此时表示一轮的点名结束
            //list 空了 list2 5个学生的姓名
            list.addAll(list2);
            list2.clear();

        }
    }


}
