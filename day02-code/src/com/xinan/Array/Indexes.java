package com.xinan.Array;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/2 22:21
 */
public class Indexes {
    public static void main(String[] args) {
        //利用索引对数组中的数字进行访问

        //1.获取数组里面的元素
        //格式；数组名[索引]

        int[] array = {1, 2, 3, 4};
        int num = array[0];
        System.out.println(num);
        //获取数组中的1索引上对应的数据，并直接打印出来
        System.out.println(array[1]);

        //2.把数据存到数组当中
        //格式：数组名[索引] = 具体数据/变量
        //细节：一旦覆盖后，原来的数据就不存在了。
        array[0] =100;
        System.out.println(array[0]);
    }
}
