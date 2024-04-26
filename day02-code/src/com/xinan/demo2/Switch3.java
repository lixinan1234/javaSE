package com.xinan.demo2;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/15 10:37
 */
public class Switch3 {
    public static void main(String[] args) {
        /*需求：
         *键盘录入星期数，输出工作日，休息日。
         *（1~5）工作日，（6~7）休息日
         */

        //1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int i = sc.nextInt();

//        //2.判断
//        if (i >= 1 && i <= 7) {
//            if (i >= 1 && i <= 5) {
//                System.out.println("工作日");
//            } else if (i >= 6 && i <= 7) {
//                System.out.println("休息日");
//            }
//        } else {
//            System.out.println("请输入正确的星期数");
//        }

        //2.用switch语句来进行选择

        //（1）
//        switch (i){
//            case (1):
//                System.out.println("工作日");
//                break;
//            case (2):
//                System.out.println("工作日");
//                break;
//            case (3):
//                System.out.println("工作日");
//                break;
//            case (4):
//                System.out.println("工作日");
//                break;
//            case (5):
//                System.out.println("工作日");
//                break;
//            case (6):
//                System.out.println("休息日");
//                break;
//            case (7):
//                System.out.println("休息日");
//                break;
//        }
        //（2）
        switch (i) {
            case (1):
            case (2):
            case (3):
            case (4):
            case (5):
                System.out.println("工作日");
                break;
            case (6):
            case (7):
                System.out.println("休息日");
                break;
                default:
                    System.out.println("没有这个星期");
        }

    }
}
