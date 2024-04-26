package com.五道经典算法题.不死神兔;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/28 18:50
 */
public class test {
    public static void main(String[] args) {
        /*有一对兔子，从出生后第三个月起每个月都生一对兔子，
        小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月有多少对兔子
         1月: 1
         2月: 1
         3月: 2
         4月: 3
         5月: 5
         6月: 8
        特点:从第三个数开始，是前两个数据和（斐波那契数列）
         */

        //求解1：
        //1.创建一个长度为12的数组
        int[] arr = new int[12];
        //2.手动给0索引和1索引的数据进行赋值
        arr[0] = 1;
        arr[1] = 1;
        //3.利用循环给剩余的数据进行赋值
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[11]);
    }
}
