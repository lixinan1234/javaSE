package com.xinan.Array;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/3 13:24
 */
public class Traversal {
    public static void main(String[] args) {
        //1.定义数组
        int[] array = {1, 2, 3, 4, 5};

        //2.获取数组里面所有的元素
        //格式：数组名[索引]
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

        //上面代码太麻烦

        //利用循环改进代码
        //开始条件：0
        //结束条件：4（数组最大长度 - 1）
//        for (int i = 0; i <= 4; i++) {
////            System.out.println(array[i]);
////        }

        //在JAVA中关于数组的一个长度属性：length
        //调用方式：数组名.length
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
