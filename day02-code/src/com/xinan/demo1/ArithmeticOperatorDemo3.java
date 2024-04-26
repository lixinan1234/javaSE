package com.xinan.demo1;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/9 23:36
 */
public class ArithmeticOperatorDemo3 {
    public static void main(String[] args) {
        //键盘输入三个数，获取其中的个位，十位，百位
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数字");
        int number = sc.nextInt();

        //2.获取个位、十位、百位
        //计算公式：个位 数字 % 10
        //         十位 数字 / 10 % 10
        //         百位 数字 / 10 / 10 % 10

        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 10 / 10 % 10;

        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);

    }
}
