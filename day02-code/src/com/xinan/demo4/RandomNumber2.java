package com.xinan.demo4;

import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/1 17:14
 */
public class RandomNumber2 {
    public static void main(String[] args) {
        //秘绝
        //用来生成任意数到任意数之间的随机数7~15
        //1.让这个范围头尾都减去一个值，让这个范围从0开始 -7  0~8
        //2.尾巴+1   8+1=9
        //3.最终结果，再加上第一步减去的值

        Random r = new Random();
        int number = r.nextInt(9)+7;
               //0~8 + 7
               //（最大值-最小值+1）+最小值
        System.out.println(number);
    }
}
