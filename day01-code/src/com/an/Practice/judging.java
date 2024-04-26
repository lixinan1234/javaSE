package com.an.Practice;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/14 0:04
 */
public class judging {
    public static void main(String[] args) {
        /*
         * 需求：
         * 在唱歌比赛中，有6名评委给选手打分，分数范围是[0~100]之间的整数。
         *选手的最后得分为：
         * 去掉高分，最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
         * */

        //分析：
        //1.定义一个数组，用来存储6名评委的打分（0~100），用键盘录入的方式
        //键盘录入：
        Scanner sc = new Scanner(System.in);
        System.out.println("请打出6个 0~100 的分数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        //定义数组：
        int[] array = {a, b, c, d, e, f};
        //遍历数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //2.求出数组中的最大值
        //临时认为0索引的数据是最大的
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        //循环以后打印最大值
        System.out.println("最大值为：" + max);

        //3.求出数组的最小值
        //临时认为0索引为最小值
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        //循环以后打印最小值
        System.out.println("最小值为：" + min);

        //4.求出数组中6个分数的总和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum =  sum + array[i];
        }
        System.out.println("6位评委打的分数总和为：" +sum);
        //5.用总和 - 最大值 - 最小值 = 最终的得分
        int num = sum - max - min;
        int finalScore = num / 4;
        System.out.println("最终得分为："+ finalScore);
    }
}
