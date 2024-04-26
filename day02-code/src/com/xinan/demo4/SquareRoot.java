package com.xinan.demo4;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/19 18:47
 */
public class SquareRoot {
    public static void main(String[] args) {
        //需求：键盘录入一个大于等于2的整数X,计算并返回X的平方根
        //结果只保留整数部分，小数部分将被舍去

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个大于等于2的整数");
        int num = sc.nextInt();

        //2.计算并返回这个数的平方根
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                System.out.println(i + "就是平方根");
                break;
            }else if(i*i>num){
                System.out.println((i-1)+"就是"+num+"平方根的整数部分");
                break;
            }
        }
    }
}
