package com.Exception;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/17 21:53
 */
public class Demo2dian4 {
    public static void main(String[] args) {
         /*
        自己处理（捕获异常）灵魂四问：
        灵魂4问：如果try中遇到了问题，那么try下面的其他代码还会执行嘛
             答：下面的代码就不会执行了，直接跳转到对应的catch当中，执行catch里面的语句体。
         */

        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[10]);
            System.out.println("1看看有没有被执行呢");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }
        System.out.println("2看看我执行了嘛");
    }
}
