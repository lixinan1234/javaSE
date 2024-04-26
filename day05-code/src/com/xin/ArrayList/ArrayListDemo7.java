package com.xin.ArrayList;

import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/13 16:32
 */
public class ArrayListDemo7 {
    public static void main(String[] args) {
        //需求：
        //定义一个Javabean类：Phone
        //main方法中定义一个集合，存入三个手机对象。
        //分别为：小米，1000，苹果，8000，锤子2999。
        //定义一个方法，将价格低于3000的手机返回。

        //1.定义一个集合
        ArrayList<Phone> list = new ArrayList<>();

        //2.创建手机对象
        Phone s1 = new Phone("小米",1000);
        Phone s2 = new Phone("苹果",8000);
        Phone s3 = new Phone("锤子",2999);

        //3.将对象赋值给集合
        list.add(s1);
        list.add(s2);
        list.add(s3);


        //4.调用方法，将价格低于3000的手机返回
        getPone(list);
    }

    public static void getPone(ArrayList<Phone> list){
        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            int jiaGe1 = phone.getJiaGe();
            if(jiaGe1<3000){
                System.out.println(phone.getName() +", "+phone.getJiaGe());
            }
        }

    }











}
