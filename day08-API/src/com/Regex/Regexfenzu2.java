package com.Regex;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/11 19:22
 */
public class Regexfenzu2 {
    public static void main(String[] args) {

        //将字符串：我要学学学编编编编程程
        //替换为：我要学编程
        String str1 = "我要学学学编编编编程程";
        String s = str1.replaceAll("(.)\\1+","$1");
        System.out.println(s);




    }
}
