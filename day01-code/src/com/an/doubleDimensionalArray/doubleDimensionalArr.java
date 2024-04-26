package com.an.doubleDimensionalArray;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/20 15:01
 */
public class doubleDimensionalArr {
    public static void main(String[] args) {
        //1.二维数组的静态初始化
        //建议以后这样定义，把一个一维数组，单独写一行
        //注意：每一个一维数组其实就是二维数组中的元素，所以每一个一维数组后面要用逗号隔开。最后一个一维数组不用加逗号
        int[][] arr = {
                {1,2,3},
                {4,5,6,7}
        };
        //2获取元素
        System.out.println(arr[0][0]);

        //3.遍历二维数组
        //外循环：遍历二维数组，得到里面的每一个一维数组
        for (int i = 0; i < arr.length; i++) {
            //内循环：遍历一维数组，得到里面的每一位元素
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            //换行
            System.out.println();
        }
    }
}
