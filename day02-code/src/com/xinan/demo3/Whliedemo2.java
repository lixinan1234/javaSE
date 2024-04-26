package com.xinan.demo3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/16 20:07
 */
public class Whliedemo2 {
    public static void main(String[] args) {
        //需求：给你一个数X
        //如果X是一个回文整数，打印true，否则返回false
        //解释：回文数是指正序（从左向右）和倒序（从右向左）都出来的数都一样
        //121是回文，123不是

        //核心思路：把数字倒过来跟原来的数字进行比较

        //1.定义数字
        int i = 1221;
        //定义一个临时变量记录X原来的值，用于最后进行比较
        int num2 = i;
        //2.利用循环开始
        int num = 0;
        while (i != 0) {
            //从右往左获取每一位数字
            int ge = i % 10;
            //修改X记录的值
            i = i / 10;
            //把当前获取到的数字拼接到最右边
            num = num * 10 + ge;
        }
        //4.打印num
        System.out.println(num);
        //5.比较
        System.out.println(num == num2);
    }
}
