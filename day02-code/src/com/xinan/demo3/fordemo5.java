package com.xinan.demo3;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/15 20:36
 */
public class fordemo5 {
    public static void main(String[] args) {
        /*
         * 需求：键盘录入两个数字，表示一个范围
         * 统计这个范围中。
         * 既可以被3整除，又可以被5整除的数字有多少个
         * */

        //1.键盘录入两个数字的范围
        Scanner sc = new Scanner(System.in);
        System.out.println("键盘录入第一个数的范围");
        int number = sc.nextInt();
        System.out.println("键盘录入第二个数的范围");
        int number2 = sc.nextInt();


        //统计变量
        //简单理解：统计符合要求的数字的个数
        int sum = 0;
        //2.录入的两个数字可以被3整除，又可以被5整除
        for (int i = number; i <= number2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
               sum++;
            }
        }
        System.out.println(sum);

    }
}
