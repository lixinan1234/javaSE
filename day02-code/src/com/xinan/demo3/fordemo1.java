package com.xinan.demo3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/15 19:22
 */
public class fordemo1 {
    public static void main(String[] args) {
        /*
         *要求打印：1~5
         *要求打印：5~1
         */

        //打印1~5
        for (int number = 1; number <= 5; number++) {
            System.out.println(number);
        }

        System.out.println("-----------------------------");

        //打印5~1
        for (int number2 = 5; number2 >= 1; number2--) {
            System.out.println(number2);
        }

    }
}
