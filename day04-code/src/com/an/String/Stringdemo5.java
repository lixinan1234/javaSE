package com.an.String;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/4 15:41
 */
public class Stringdemo5 {
    public static void main(String[] args) {

        //遍历字符
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String num = sc.next();

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            System.out.print(c);
        }
    }
}
