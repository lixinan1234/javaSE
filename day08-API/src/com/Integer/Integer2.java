package com.Integer;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/19 15:35
 */
public class Integer2 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        String i = sc.nextLine();
        System.out.println(i);
        double v = Double.parseDouble(i);
        System.out.println(v+1);
    }
}
