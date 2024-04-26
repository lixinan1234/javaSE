package com.xinan.Array;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/4 13:30
 */
public class Max {
    public static void main(String[] args) {
        //定义数组求最大值：33，5，22，44，55

        //1.定义数组
        int[] array = {33,5,99,44,55};
        //2.定义一个变量MAX用来存储最大值
        //临时认为0索引的数据是最大的
        int max = array[0];
        //3.循环获取数组中的每一个元素
        //拿着每一个元素和MAX进行比较
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        //循环结束后，打印最大值
        System.out.println(max);
    }
}
