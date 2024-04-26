package com.an.obiectOriented;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/30 1:52
 */
public class PhoneText {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();

        //叫做给手机赋值
        p.brand = "小米";
        p.price = 1998.99;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);


        //调用手机中的方法即可
        p.call();
        p.playGame();

        System.out.println("=======================");

        //第二部手机
        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 8888.88;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.call();
        p2.playGame();

    }
}
