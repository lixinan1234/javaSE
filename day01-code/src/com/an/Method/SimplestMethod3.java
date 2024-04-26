package com.an.Method;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/6 0:22
 */
public class SimplestMethod3 {
    public static void main(String[] args) {
        /*需求：定义一个方法，在方法内部定义两个变量。
          求出他们的和并进行打印*/

        Variable();

    }

    //定义一个方法
    public static void Variable() {
        int a = 10;
        int b = 20;

        int num = a + b;

        System.out.println(num);
    }

}
