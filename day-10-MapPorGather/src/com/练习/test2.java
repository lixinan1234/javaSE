package com.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/10 22:32
 */
public class test2 {
    public static void main(String[] args) {
         /*
        班级里有N个学生
        要求:
        70% 的概率随机到男生
        30% 的概率随机到女生
         */

         //1.创建集合的对象
        ArrayList<Integer> list = new ArrayList<>();
        //2.添加元素
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);
        //3.打乱集合中的数据
        Collections.shuffle(list);
        //4.从List集合中随机抽取0或者1
        Random r = new Random();
        int index = r.nextInt(list.size());
        Integer number = list.get(index);
        System.out.println(number);


        //5.创建两个集合分别存男生和女生名字
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList,"张角","吕布","赵云","曹贼","曹丕","诸葛亮","刘备");
        Collections.addAll(girlList,"孙尚香","大乔","小乔");

        //6.判断此时是boyList里抽取的还是girList里抽取的
        if(number==1){
            int boyIndex = r.nextInt(boyList.size());
            String name = boyList.get(boyIndex);
            System.out.println(name);
        }else {
            int girlIndex = r.nextInt(girlList.size());
            String name = girlList.get(girlIndex);
            System.out.println(name);
        }
    }
}
