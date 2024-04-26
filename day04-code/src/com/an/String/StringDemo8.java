package com.an.String;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/4 16:37
 */
public class StringDemo8 {
    public static void main(String[] args) {

        //题目：定义一个方法，实现字符串反转
        //      abc 输出结果为cba
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入字符串");
        String num = sr.next();
        String abc = fangfa(num);
        System.out.println(abc);

    }

    public static String fangfa(String str) {
        String result = "";
        //倒着遍历
        for (int i = str.length() - 1; i >= 0; i--) {
            //i 依次表示字符串中的每一个索引
            char c = str.charAt(i);
            //字符串拼接
            result = result + c;
        }
        return result;

    }
}
