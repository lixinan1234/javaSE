package com.an.Practice;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/10 23:00
 */
public class hh {
    public static void main(String[] args) {
        /*
         * 卖飞机票
         * 需求：
         * #机票价格按照淡季旺季，头等舱和经济舱，输入机票原价，月份和头等舱或经济舱
         * #按照如下规则计算机票价格：旺季（5~10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折
         * */

        //1.键盘录入机票原价，月份，头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println(" 1 头等舱或者 2 经济舱");
        int seat = sc.nextInt();

        //2.按照如下规则计算机票价格：旺季（5~10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折


        if (month >= 5 && month <= 10) {
            danji(price, seat, 0.9, 0.85, "请输入有效数字");
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            danji(price, seat, 0.7, 0.65, "请输入有效号码");

        } else {
            System.out.println("请正确输入月份（数字）");
        }
    }

    private static void danji(int price, int seat, double v, double v2, String 请输入有效数字) {
        switch (seat) {
            case 1:
                price = (int) (price * v);
                System.out.println("头等舱的票价是" + price);
                break;
            case 2:
                price = (int) (price * v2);
                System.out.println("经济舱的票价是" + price);
                break;
            default:
                System.out.println(请输入有效数字);
        }
    }
}
