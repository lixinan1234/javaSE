package com.an.String;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/4 20:50
 */
public class StringDemo11 {
    public static void main(String[] args) {
        //1.键盘录入一个身份证号码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个身份证号码：");
        String id = sc.next();


        //3.截取身份证号码
        String substring1 = id.substring(6, 10);
        String substring2 = id.substring(10, 12);
        String substring3 = id.substring(12, 14);

        System.out.println("出身日期是：" + substring1 + "年" + substring2 + "月" + substring3 + "日");

        //获取性别
        char c = id.charAt(16);//拿到索引
        System.out.println(c);
        if (c % 2 == 0) {
            System.out.println("性别：女");
        }else {
            System.out.println("性别：男");
        }


    }
}
