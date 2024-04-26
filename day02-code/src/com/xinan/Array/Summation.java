package com.xinan.Array;

import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/4 13:47
 */
public class Summation {
    public static void main(String[] args) {
        /*需求：生成10个1~100之间的随机数存入数组。
        1.求出所有数据的和
        2.求出所有数据平均数
        3.统计有多少个数据比平均数小
         */

        //1.定义数组
        int[] array = new int[10];
        //2.把随机数存入到数组当中
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            //每一次循环都会生成一个新的随机数
            int number = r.nextInt(100) + 1;
            //把生成的随机数添加到数组当中
            //数组名[索引] = 数据;
            array[i] = number;
        }

        //（1）求出所有数据的和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("所有数据和为" + sum);

        System.out.println("--------------------------");

        //(2)求出所有数据平均数
        int avg = sum / array.length;
        System.out.println("所有数的平均数为" + avg);

        System.out.println("------------------------");

        //(3)统计有多少个数据比平均数小
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
                num++;
            }
        }
        System.out.println("有" + num + "个数比平均数小");

        System.out.println("--------------------------");

        //遍历数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
