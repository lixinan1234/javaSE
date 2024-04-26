package com.Exception;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/17 22:11
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("看看我执行了嘛");
    }
}
