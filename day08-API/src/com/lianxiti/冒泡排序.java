package com.lianxiti;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/19 17:36
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        //冒泡排序：

        //1.定义数组
        int[] arr = {2, 6, 4, 7, 1};
        //2.利用冒泡排序将数组的数据变成1，2，4，6，7
        //第一轮
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
