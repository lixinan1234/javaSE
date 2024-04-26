package com.an.Method;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/7 23:35
 */
public class ExistenceOrNot {
    public static void main(String[] args) {
        //要求：定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处;

        //1.定义一个数组
        int[] array = {2,4,7,3,9,10,5};

        //2.调用方法
        boolean flag = num(array,5);

        //3.打印
        System.out.println(flag);

    }

    //定义一个方法
    public static boolean num(int[] array,int number){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                return true;
            }
        }
        return false;
    }

}
