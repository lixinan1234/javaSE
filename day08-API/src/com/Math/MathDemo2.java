package com.Math;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/11 19:36
 */
public class MathDemo2 {
    public static void main(String[] args) {
        //要求：统计一共有多少个水仙花数。
        //水仙花数：100 ~ 999

        int count = 0;
        //得到每一位数
        for (int i = 100; i <= 999; i++) {
            //个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //判断
            //每位三次方之和 跟本身 进行比较。
            double sum = Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);
            if (sum==i){
                count++;
                System.out.print(i+" , ");
            }
        }
        System.out.println("水仙花数一共有"+count+"个");
    }
}
