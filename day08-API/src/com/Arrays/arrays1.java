package com.Arrays;

import java.util.Arrays;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/26 13:36
 */
public class arrays1 {
    public static void main(String[] args) {
        //toString :将数组拼成一个字符串
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr1));

        //CopyOf拷贝数组
        System.out.println("---------拷贝数组------------");
        int[] newArr1 = Arrays.copyOf(arr1,10);
        System.out.println(Arrays.toString(newArr1));

        //CopyOfRange 拷贝数组（指定范围）
        System.out.println("----------拷贝数组（指定范围）--------------");
        int[] newArr2 = Arrays.copyOfRange(arr1,1,6);
        System.out.println(Arrays.toString(newArr2));

        //fill:填充数据
        System.out.println("-----------填充数据------------");
        Arrays.fill(arr1,100);
        System.out.println(Arrays.toString(arr1));

        //Sort数据排序
        System.out.println("----------数据排序---------");
        int[] arr2 = {1,2,32,4,2,87,3};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //升序降序
        //o1-o2升序
        //o2-o1降序
        Integer[] arr3 = {1,3,2,6,9,7};
        Arrays.sort(arr3, (o1, o2) -> o2-o1);
        System.out.println(Arrays.toString(arr3));

    }
}
