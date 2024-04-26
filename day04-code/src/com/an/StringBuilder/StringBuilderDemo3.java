package com.an.StringBuilder;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/5 12:03
 */
public class StringBuilderDemo3 {
    public static void main(String[] args) {

        //题目：键盘录入一个字符串，程序判断出该字符串是不是对称字符串，并在控制台打印出来



        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String number = sc.next();

        //2.反转
        String result = new StringBuilder().append(number).reverse().toString();

        //3.进行比较
        if(number.equals(result)){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }

    }
}
