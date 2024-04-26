package com.Regex;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/2/18 12:46
 */
public class Regex2 {
    public static void main(String[] args) {
        String str = "123456789";
        System.out.println(str.matches("([1~9]\\d{5,15})"));
    }
}
