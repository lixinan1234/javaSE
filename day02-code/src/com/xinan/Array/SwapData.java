package com.xinan.Array;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/4 18:14
 */
public class SwapData {
    public static void main(String[] args) {
        /*需求：定义两个变量，交换两个变量记录的值 */

        int a = 1;
        int b = 2;

        //定义一个临时的第三方变量
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------------------");

        /*需求：定义一个数组，将数组中的0索引和最大索引的值进行交换*/
        int[] array = {1, 2, 3, 4, 5};
        int num = array[0];
        array[0] = array[4];
        array[4] = num;

        //遍历数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println("------");

        /*需求：定义一个数组，存入1，2，3，4，5，按照要求交换索引对应的要求
         交换前：1，2，3，4，5
         交换后：5，4，3，2，1
         */

        //1.定义数组
        int[] arr = {1, 2, 3, 4, 5};
        //2.利用循环交换数据
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //交换变量i和变量b指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //当循环结束后，那么数组中的数据就实现了头尾交换
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
}
}
