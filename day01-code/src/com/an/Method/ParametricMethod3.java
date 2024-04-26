package com.an.Method;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/6 1:30
 */
public class ParametricMethod3 {
    public static void main(String[] args) {
        /*需求：定义一个方法，求圆的面积，将结果在方法中进行打印*/
        Acreage(1.5);
    }

    //定义一个无参的方法
    public static void Acreage(double radius){
        double proportion = radius *radius *3.14;
        System.out.println(proportion);
    }
}
