package com.an.Method;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/7 14:38
 */
public class ArrayMax {
    public static void main(String[] args) {
        /*
        * 需求：设计一个方法求数组的最大值，并将最大值返回
        * */
        //1.定义一个数组
        int[] arrayMax = {13,42,23,98,34,29};

        //2.调用方法
        int max = maximum(arrayMax);

        //3.打印
        System.out.println(max);

    }

    //定义一个方法
    public static int maximum(int[] arrayMax){
        int max = arrayMax[0];
        for (int i = 0; i < arrayMax.length; i++) {
            if(arrayMax[i]>max){
                max = arrayMax[i];
            }
        }
        return max;
    }

}
