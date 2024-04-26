package com.an.doubleDimensionalArray;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/30 0:49
 */
public class exercise {
    public static void main(String[] args) {
        /*
        * 二维数组的练习
        * 某商场每个季度的营业额如下：单位（万元）
        * 第一季度：22，66，44
        * 第二季度：77，33，88
        * 第三季度：25，45，65
        * 第四季度：11，66，99
        * 要求计算每个季度的总营业额和全年总营业额
        * */
        //1.定义一个二维数组
        int [][] arr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };

        //表示全年的营业额
        int yearSum = 0;
        //2.遍历二维数组，得到每一个一维数组并求和
        for (int i = 0; i < arr.length; i++) {
            int [] ints = arr[i];
            int sum = getSum(ints);
            System.out.println("第" + (i + 1) + "个季度总营业额为" + sum);
            yearSum = yearSum + sum;
        }
        System.out.println("全年总营业额为：" + yearSum);

    }
    //定义一个方法，计算每个季度营业额
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
