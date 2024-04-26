package com.Exception;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/17 21:41
 */
public class Demo2dian2 {
    public static void main(String[] args) {
        /*
        自己处理（捕获异常）灵魂四问：
        灵魂1问：如果try中没有遇到问题，怎么执行
              答：会把try里面的所有代码全部执行完毕，不会执行catch里面的代码
              注意：只有当出现异常才会执行catch里面的代码
         */

        int[] arr = {1,2,3,4,5};
        try{
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }
        System.out.println("看看我执行了嘛");
    }
}
