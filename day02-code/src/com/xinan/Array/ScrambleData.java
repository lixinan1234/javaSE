package com.xinan.Array;

import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/5 0:30
 */
public class ScrambleData {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1~5，要求打乱数组中所有数据的顺序*/

        //1.定义数组
        int[] array = {1,2,3,4,5};
        //索引范围：0 1 2 3 4
        Random r = new Random();
        //遍历数组从0索引开始打乱数据的顺序

        for (int i = 0; i < array.length; i++) {
            //生成一个随机索引
            int ScrambleData = r.nextInt(array.length);
            //拿着随机索引指向元素 跟 i指向的元素进行交换
            int temp = array[i];
            array[i] = array[ScrambleData];
            array[ScrambleData] = temp;
        }

        //当循环结束之后，那么数组中所有的数据已经打乱顺序了
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
