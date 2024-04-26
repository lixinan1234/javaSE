package com.xinan.demo2;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/14 23:08
 */
public class Switch2 {
    public static void main(String[] args) {
        /*需求：键盘录入星期数，显示今天的减肥活动
         *周一：跑步
         *周二：游泳
         *周三：慢走
         *周四：爬山
         *周五：动感单车
         *周六：拳击
         *周日：好好吃一顿
         */
        //1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数");
        String week = sc.next();
        //用switch进行匹配
        switch (week){
            case "周一":
                System.out.println("跑步");
                break;
            case "周二":
                System.out.println("游泳");
                break;
            case "周三":
                System.out.println("慢走");
                break;
            case "周四":
                System.out.println("爬山");
                break;
            case "周五":
                System.out.println("动感单车");
                break;
            case "周六":
                System.out.println("拳击");
                break;
            case "周日":
                System.out.println("好好吃一顿");
                break;
                default:
                    System.out.println("是不是没睡醒，请正确输入星期数！");


        }

    }
}
