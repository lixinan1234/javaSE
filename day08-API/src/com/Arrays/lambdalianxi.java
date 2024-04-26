package com.Arrays;

import java.util.Arrays;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/26 14:42
 */
public class lambdalianxi {
    public static void main(String[] args) {
        //定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
        //要求：按照字符串的长度进行排序，短的在前面，长的在后面

        String[] arr = {"aa","a","aaa"};
        Arrays.sort(arr,( o1,  o2)-> o1.length()-o2.length());
        System.out.println(Arrays.toString(arr));

    }
}
