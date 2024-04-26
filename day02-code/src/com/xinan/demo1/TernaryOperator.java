package com.xinan.demo1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/12 16:49
 */
public class TernaryOperator {
    public static void main(String[] args) {
        //需求：使用三元运算符，获取两个数的最大值

        //1.定义两个变量定义两个整数
        int a = 10;
        int b = 20;
        //2.使用三元运算符获取两个数的最大值
        //格式；关系表达式？表达式1：表达式2
        //整个三元运算符的的结果必须要被使用

        int max = a > b ? a:b;
        System.out.println(max);


    }
}
