package com.Exception;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/17 21:45
 */
public class Demo2dian3 {
    public static void main(String[] args) {
         /*
        自己处理（捕获异常）灵魂三问：
        灵魂3问：如果try中遇到的问题没有被捕获，怎么执行
             答：相当于try...catch代码白写了，最终还是会交给处理机进行处理。
         */

        int[] arr = {1,2,3,4,5};

        try {
            //可能出现的异常
            System.out.println(arr[10]);
        }catch (NullPointerException e){
            System.out.println("索引越界");
        }
        System.out.println("看看我执行了嘛");
    }
}
