package com.xinan.demo4;

import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/1 17:31
 */
public class RandomNumber3 {
    public static void main(String[] args) {
        //需求：
        //随机数范围：1~100

        Random r = new Random();
        int number = r.nextInt(100)+1;
        System.out.println(number);
    }
}
