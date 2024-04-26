package com.an.a02staticdemo2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/21 15:54
 */
public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中两个方法是否正确

        int[] array1 = {1,2,3,4,5};
        String s = ArrayUtil.printArr(array1);
        System.out.println(s);

        //求平均值
        double[] array2 = {1.5,1.7,1.9};
        double average = ArrayUtil.getAverage(array2);
        System.out.println(average);
    }
}
