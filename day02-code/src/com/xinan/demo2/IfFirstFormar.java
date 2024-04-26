package com.xinan.demo2;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/14 0:23
 */
public class IfFirstFormar {
    public static void main(String[] args) {
        /*要求：键盘录入女婿的酒量，如果大于2斤，
               老丈人给出回应，反正不回应*/

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int i = sc.nextInt();
        //用IF判断
        //格式：if(关系表达式){
        //         语句体；
        //     }
        if(i > 2){
            System.out.println("小伙子，不错哟！！");
        }
    }
}
