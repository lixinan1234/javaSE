package com.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/10 22:20
 */
public class Test1 {
    public static void main(String[] args) {
        /*
        班级里有N个学生，学生属性：姓名，年龄，性别
        实现随机点名器
         */

        //1.定义集合
        ArrayList<String> list = new ArrayList<>();
        //2.批量添加元素
        Collections.addAll(list,"张角","吕布","赵云","曹贼");
        //3.随机点名
        Random r = new Random();
        int index = r.nextInt(list.size());
        String s = list.get(index);
        System.out.println(s);

        //第二种方法
        Collections.shuffle(list);
        String s1 = list.get(0);
        System.out.println(s1);

    }
}
