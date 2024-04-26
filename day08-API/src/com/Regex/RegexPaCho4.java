package com.Regex;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/9 17:25
 */
public class RegexPaCho4 {
    public static void main(String[] args) {

        //要求1：把字符串中的三个姓名之间的字母替换vs
        //要求2：把字符串中的三个姓名切割出来

        String str = "小璇璇skdsckwj123小灰灰wkjdwkej小圈圈";

        String vs = str.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(vs);


    }
}
