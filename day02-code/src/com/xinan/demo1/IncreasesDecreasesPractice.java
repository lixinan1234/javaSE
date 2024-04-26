package com.xinan.demo1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/10 22:52
 */
public class IncreasesDecreasesPractice {
    public static void main(String[] args) {
        int a = 10;
        //后++，先用后加
        //先把a中的值先拿出来用，赋值b,再自增
        int b = a++;//b=10,a=11
        //先++，先加后用
        //先对X进行自增，然后把自增的结果赋值给左边的变量。
        int c = ++a;
        System.out.println("a是：" + a);
        System.out.println("b是：" + b);
        System.out.println("c是：" + c);
    }
}
