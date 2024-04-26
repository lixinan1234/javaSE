package com.xinan.demo2;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/15 11:00
 */
public class Switch4 {
    public static void main(String[] args) {
        /*
         * 实际开发中，如果我们在需要在多种情况下选择其中一个，就可以使用switch语句。
         * 当我们拨打了某些服务电话时，一般都会有按键选择。
         * 假设现在我们拨打了一个机票预定电话。
         * 电话中语音提示：
         * 1机票查询
         * 2机票预定
         * 3机票改签
         * 4退出服务
         * 其他按键也是退出服务，请使用switch模拟该业务逻辑
         * */

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1~4的数字");
        int number = sc.nextInt();

        //2.使用switch语句进行比较
        switch (number) {
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
            default:
                System.out.println("退出服务");
        }
    }
}
