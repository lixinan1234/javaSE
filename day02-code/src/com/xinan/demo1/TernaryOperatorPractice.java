package com.xinan.demo1;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/12 16:59
 */
public class TernaryOperatorPractice {
    public static void main(String[] args) {
        /*需求：动物园里面有两只老虎，体重分别为通过键盘录入获得
        请用程序判断两只老虎的体重是否相同*/

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一只老虎a的体重");
        int a = sc.nextInt();
        System.out.println("再输入另一只老虎b的体重");
        int b = sc.nextInt();
        //判断两只老虎的体重是否相同

        String result = a == b ? "相同":"不同";
        System.out.println(result);



    }
}
