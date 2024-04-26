package com.an.String;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/4 20:24
 */
public class StringDemo10 {
    public static void main(String[] args) {
        //1.获取一个手机号码
        Scanner sc = new  Scanner(System.in);
        System.out.println("请输入11位数的电话号码，将会提您保密");
        String phoneNumber = sc.next();

        //2.截取手机号码的前三位
        String substring1 = phoneNumber.substring(0, 3);

        //3.截取手机号后四位
        String substring2 = phoneNumber.substring(7);

        //4.拼接
        String result = substring1 + "****" + substring2;

        //5.打印
        System.out.println(result);
        }
    }

