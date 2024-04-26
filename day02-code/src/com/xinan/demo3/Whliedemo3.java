package com.xinan.demo3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/16 21:55
 */
public class Whliedemo3 {
    public static void main(String[] args) {
        /*
         * 需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）。
         * 将两数相除，要求不使用乘法，除法和%运算符。
         * 得到商和余数。
         * */

        //定义两个整数
        int num = 10;
        int num2 = 3;
        //定义一个变量用来统计相加减了多少次
        int i = 0;
        //用whlie循环
        while (num >= num2) {
            num = num - num2;
            i++;
        }
        System.out.println("商：" + i);
        System.out.println("余数：" + num);
    }
}
