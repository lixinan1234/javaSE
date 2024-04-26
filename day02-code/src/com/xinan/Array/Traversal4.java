package com.xinan.Array;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/4 11:51
 */
public class Traversal4 {
    public static void main(String[] args) {
        /*定义一个数组，存储1，2，3，4，5，6，7，8，9，10
          遍历数组得到每一个元素
          要求：
          如果是奇数，则当前数字扩大两倍
          如果是偶数，则当前数字缩小二分之一
         */


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                //偶数变成二分之一
                array[i] = array[i] / 2;
            } else {
                //奇数变大两倍
                array[i] = array[i] * 2;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
