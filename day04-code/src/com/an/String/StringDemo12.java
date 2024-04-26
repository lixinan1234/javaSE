package com.an.String;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/5 10:31
 */
public class StringDemo12 {
    public static void main(String[] args) {
        //1.获取到说的话
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要说的话：");
        String str = sc.next();

        //2.定义一个敏感词库
        String[] arr = {"TMD","他妈的","死妈","孤儿"};

        //3.循环得到数组中每一个敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i], "***");
        }



        //3.打印结果
        System.out.println(str);
    }
}
