package com.an.doubleDimensionalArray;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/30 0:19
 */
public class dynqmiCondition {
    public static void main(String[] args) {
        //格式：数据类型[][]数组名 = new 数据类型[m][n]
        //m表示这个二维数组，可以存放多少个一维数组
        //n表示每一个一维数组可以存放多少个元素

        //1.利用动态初始化创建一个二维数组
        int [][] arr = new int[3][5];

        //给二维数组赋值一个元素
        arr[0][0] = 10;

        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
