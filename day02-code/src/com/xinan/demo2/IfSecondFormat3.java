package com.xinan.demo2;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/14 16:27
 */
public class IfSecondFormat3 {
    public static void main(String[] args) {
        /*
        * 要求：在实际开发中，电影院选座也会使用到if判断。
        * 假设某影院售卖了100张门票，票号为1~100.
        * 其中奇数票号坐左侧，偶数票号坐右侧。
        * 键盘录入一个整数表示电影的票号。根据不同情况，给出不同的提示：
        * 如果票号为奇数，那么打印坐左边
        * 如果票号为偶数，那么打印坐右边
        * */

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("输入0~100的门票");
        int tickets = sc.nextInt();
        //2.判断当tickets在0~100之间，才真实有效的票
        //if嵌套
        if(tickets >=0 && tickets <=100){
            if(tickets / 2 == 0){
                System.out.println("先生您好，请右边坐");
            }else{
                System.out.println("先生您好，请左边坐");
            }

        }

    }
}
