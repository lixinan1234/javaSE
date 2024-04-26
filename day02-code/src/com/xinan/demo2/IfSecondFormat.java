package com.xinan.demo2;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/14 15:31
 */
public class IfSecondFormat {
    public static void main(String[] args) {
        /*
        * 键盘录入身上的钱
        * 如果大于一百块，就吃网红餐厅
        * 否则，就吃经济实惠的沙县小吃
        */

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身上的money");
        int money = sc.nextInt();

        //2.判断，true就执行语句体1，false就执行语句体2
        if(money > 100){
            System.out.println("网红餐厅");
        }else{
            System.out.println("沙县小吃");
        }

    }
}
