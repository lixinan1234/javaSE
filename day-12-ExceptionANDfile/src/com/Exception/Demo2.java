package com.Exception;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/17 21:14
 */
public class Demo2 {
    public static void main(String[] args) {
        /*
        自己处理（捕捉异常）
        格式：
        try{
            可能出现的异常;
        }catch(异常类名 变量名){
            异常的处理代码;
        }

       目的：当代码出现异常时，可以让程序继续往下执行。
         */

        int[] arr = {1,2,3,4,5};

        try {
            //可能出现的异常
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }
        System.out.println("看看我执行了嘛");
    }
}
