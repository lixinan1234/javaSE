package com;

import java.util.Arrays;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/4 17:09
 */
public class hh {
    public static void main(String[] args) {
        int[] arr = new int[]{5,7,4,3,6,2};
        bubbleSort(arr);
        System.out.println("冒泡排序完的数组："+ Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        //外部循环控制排序的趟数。冒泡排序的每一趟会将最大的元素"冒泡"到数组的末尾，因此需要执行 n-1 趟，其中 n 是元素的总数
        for (int i = 0; i < n - 1; i++) {
            //内循环控制每趟比较的次数。由于每一趟都会将一个最大的元素沉到数组末尾，所以内循环次数逐渐减小。
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换arr[j]和arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第"+(i+1)+"趟："+Arrays.toString(arr));
        }
    }

}
