package com.xinan.demo4;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/19 17:03
 */
public class EverySevenDays {
    public static void main(String[] args) {

        //游戏规则：从任意一个数开始报数，当你要报的数字是包涵7或者是7的倍数时都要说：过
        //需求：使用程序在控制台打印出1~100之间的满足逢七必过规则的数据

        //分析：个位7 十位7 倍数7

        //1.得到1~100每个数字
        for (int num = 1; num <= 100; num++) {
            if (num % 10 == 7 || num / 10 % 10 == 7 || num % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(num);
        }
    }
}
