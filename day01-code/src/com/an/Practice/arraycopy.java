package com.an.Practice;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/13 17:00
 */
public class arraycopy {
    public static void main(String[] args) {
        /*
        * 需求：
        * 把一个数组的元素复制到另一个新数组上去。
        * */

        //1.定义一个数组
        int[] array = {1,4,3,4,5};

        //2.定义一个新数组的长度和老数组的长度一样
        int[] array1 = new int[array.length];

        //3.遍历将新数组的每一个元素，依次存入到新数组当中
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }

        //4.新数组中已经存满元素了
        for (int i = 0; i < array.length; i++) {
            System.out.println(array1[i]);
        }



    }
}
