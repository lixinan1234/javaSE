package com.xinan.demo2;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/14 17:12
 */
public class IfThirdFormat {
    public static void main(String[] args) {
        /*
        * 根据不同的分数送不同的礼物
        *如果是95~100分就送自行车一辆
        * 如果90~94分就游乐场玩一天
        * 如果是80~89分就送变形金刚一个
        * 如果是80分一下就，挨打一顿
        * */

        //1.键盘录入，小明的考试成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的考试成绩");
        int score = sc.nextInt();

        //2.判断
        if(score >=0 && score <=100){
            if(score >=95 && score ==100){
                System.out.println("奖励自行车一辆！！");
            }else if(score >= 90 && score <=94){
                System.out.println("游乐场玩一天吧");
            }else if(score >= 80 && score <= 89){
                System.out.println("奖励变形金刚一个哈哈");
            }else{
                System.out.println("别跑！老子打死你");
            }
        }
        else{
            System.out.println("成绩不合法，请重新输入");
        }

    }
}
