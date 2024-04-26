package com.xinan.demo1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/12 17:12
 */
public class TernaryOperatorPractice2 {
    public static void main(String[] args) {
        /*要求：一座寺庙里住着三个和尚已知他们的身高分别为150,210,165
               请用程序实现获取这三个和尚的最高身高
        */
        //1.用三个变量分别定义三个和尚的身高
        int bonze1 = 150;
        int bonze2 = 210;
        int bonze3 = 165;

        //2.比较最高身高
        int result = bonze1 > bonze2 ? bonze1:bonze2;
        int max = result > bonze3 ? result:bonze3;
        System.out.println(max);
    }
}
