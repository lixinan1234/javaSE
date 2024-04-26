package com.xinan.Array;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/4 11:05
 */
public class Traversal2 {
    public static void main(String[] args) {
        //定义一个数组，存出1，2，3，4，5
        //遍历数组得到每一个元素，求数组里面所有的数据和

        //1.定义数组

        //求和变量
        int num = 0;
        //遍历数组得到每一个数据，累计求和
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            num = num + array[i];
        }
        System.out.println(num);
    }
}
