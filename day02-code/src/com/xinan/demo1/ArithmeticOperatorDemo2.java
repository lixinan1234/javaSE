package com.xinan.demo1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/9 22:18
 */
public class ArithmeticOperatorDemo2 {
    public static void main(String[] args) {
        //除法
        System.out.println(10 / 2);
        //整数除得出结果也是整数
        System.out.println(10 / 3);
        //想要得出小数，表达式里也要有小数,且小数可能不精确
        System.out.println(10.0 / 3);

        //取模，取余数
        System.out.println(10 % 2);//0
        System.out.println(10 % 3);//1
    }
}
