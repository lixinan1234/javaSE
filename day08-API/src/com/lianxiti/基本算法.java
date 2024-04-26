package com.lianxiti;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/19 17:12
 */
public class 基本算法 {
    public static void main(String[] args) {
        //基本查找
        //需求：定义一个方法利用基本查找，查询某个元素是否存在
        //数据如下：
        int[] arr = {131,123,23,24};
        int number = 23;
        boolean b = basicSearch(arr, number);
        System.out.println(b);

    }


    //参数：数组和要查的元素
    //返回值：元素是否存在
    public static boolean basicSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;

            }
        }
        return false;
    }
}

