package com.xinan.demo4;

import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/19 19:26
 */
public class RandomNumber {
    public static void main(String[] args) {

        //获取对象
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            //生成随机数
            int number = r.nextInt(10);//0~9
            //打印
            System.out.println(number);
        }
    }
}
