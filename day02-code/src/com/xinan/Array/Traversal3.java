package com.xinan.Array;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/4 11:15
 */
public class Traversal3 {
    public static void main(String[] args) {
        /*定义一个数组，存储1，2，3，4，5，6，7，8，9，10
          遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数
         */

        //1.定义数组
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //定义一个变量来统计次数
        int num = 0;
        //2.得到数组里面每一个元素，能被3整除的数求和
        for (int i = 0; i < array.length; i++) {
            //i表示数组里面每一个索引
            //array表示数组里面每一个元素
            if (array[i] % 3 == 0) {
                num++;

            }
        }
        System.out.println("能被3整除的数有" + num + "个");
    }
}
