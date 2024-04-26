package com.an.Method;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/7 10:56
 */
public class ReturnValue2 {
    public static void main(String[] args) {
        //需求：定义方法，比较两个长方形的面积

        //调用方法
        //第一个长方形的面积
        int one = acreage(20, 40);
        //第二个长方形的面积
        int two = acreage(30, 50);

        if (one > two) {
            System.out.println("第一个长方形面积更大");
        } else {
            System.out.println("第二个长方形面积更大");
        }

    }

    //定义一个带有返回值的方法
    public static int acreage(int length, int wide) {
        int area = (length + wide) * 2;
        return area;
    }

}
