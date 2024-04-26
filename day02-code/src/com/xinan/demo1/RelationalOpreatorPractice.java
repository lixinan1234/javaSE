package com.xinan.demo1;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/11 17:19
 */
public class RelationalOpreatorPractice {
    public static void main(String[] args) {
        //1.键盘录入两个整数的表示衣服时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("输入我们自己的相亲时髦度:");
        int i = sc.nextInt();
        System.out.println("输入女孩相亲时髦度:");
        int s = sc.nextInt();
        //2.把我穿的衣服时髦度和女孩衣服时髦度进行对比就可以了
        boolean w = i > s;
        //3.打印结果
        System.out.println(w);


    }

}

