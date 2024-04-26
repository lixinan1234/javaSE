package com.xinan.demo2;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/14 21:20
 */
public class IfThirdFormat2 {
    public static void main(String[] args) {
        /*
        在实际开发中，多种情况判断时，会用到IF的第三种格式：
        需求：
        商场都会有VIP的会员制，根据不同的会员会有不同的折扣。
        假设商品总价为1000。
        键盘录入会员级别，并计算出实际支付的钱
        会员1级：打9折
        会员2级：打8折
        会员3级：打7折
        非会员：不打折，要打也要打骨折
         */
        //1.键盘录入会员级别
        int money = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员级别");
        int grade = sc.nextInt();
        //2.判断
        if(grade >=
                1 && grade <=3){
            if(grade == 1){
                System.out.println("打9折");
                System.out.println(money * 0.9);
            }else if(grade == 2){
                System.out.println("打8折");
                System.out.println(money * 0.8);
            }else if(grade == 3){
                System.out.println("打7折");
                System.out.println(money * 0.7);
            }
        }else {
            System.out.println("非会员，要打也打骨折");
        }
    }
}
