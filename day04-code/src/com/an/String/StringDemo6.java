package com.an.String;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/4 15:51
 */
public class StringDemo6 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数组字符出现的次数

        //1.键盘录入一个字符串

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String num = sc.next();

        //2.统计 ----- 计数器思想
        //定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < num.length(); i++) {
            //i 依次表示字符串中的每一个索引
            char c = num.charAt(i);
            if (c >= 'a' && c <= 'z') {
                //char类型的变量再参与计算的时候自动类型提示为int 查询ascii码表
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字符有：" + bigCount + "个");
        System.out.println("小写字符有" + smallCount + "个");
        System.out.println("字符有" + numberCount + "个");
    }
}
