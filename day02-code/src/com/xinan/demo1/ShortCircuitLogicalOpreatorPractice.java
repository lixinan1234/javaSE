package com.xinan.demo1;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/12 16:18
 */
public class ShortCircuitLogicalOpreatorPractice {
    public static void main(String[] args) {
        /*要求：数字6是一个真正伟大的数字，键盘录入两个整数。
        如果其中一个为6,最终结果输出true。
        如果它们的和为6的倍数。最终结果输出true。
        其他情况都是false。*/

        //分析：1.键盘录入两个整数
        //变量a 变量b
        //2.a ==6 || b == 6 || (a + b) % 6 = 0
        //如果满足其中一个就输入true

        //1.键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();
        System.out.println("请再输入一个整数");
        int b = sc.nextInt();

        //2.用短路逻辑运算符去连接三个判断
        boolean result = a == 6 || b == 6 || (a + b) % 6 == 0;

        System.out.println(result);



    }
}
