package com.an.Method;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/7 14:15
 */
public class ArrayTraversal {
    public static void main(String[] args) {
        /*
         * 需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。
         * 例如：[11,22,33,44,55]
         * */
        //1.定义一个数组
        int[] array = {11, 22, 33, 44, 55};
        //2.调用方法
        printArr(array);
    }

    //定义一个方法
    public static void printArr(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
           if(i == array.length - 1){
               System.out.print(array[i]);
           }else{
               System.out.print(array[i] + ", ");
           }
        }
        System.out.print("]");
    }

}
