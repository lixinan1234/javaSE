package com.an.String;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/3 16:41
 */
public class StringDemo3 {
    public static void main(String[] args) {
        //1.假设我现在键盘录入一个abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = sc.next();//是new 出来的
        //2.代码再定义一个字符串abc
        String ste2 = "abc";
        //用==比较，两个能一样吗
        System.out.println(str1 == ste2);
    }
}
