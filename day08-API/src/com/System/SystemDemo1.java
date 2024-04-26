package com.System;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/11 20:15
 */
public class SystemDemo1 {
    public static void main(String[] args) {
        //停止虚拟机
        //System.exit(0);


        //currentTimeMillis返回当前系统的毫秒值
        long l = System.currentTimeMillis();
        System.out.println(l);

        //拷贝数组
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,6,arr2,2,3);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]+" ");
        }

    }
}
