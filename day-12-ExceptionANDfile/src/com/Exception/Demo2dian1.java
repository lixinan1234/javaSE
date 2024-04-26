package com.Exception;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/17 21:32
 */
public class Demo2dian1 {
    public static void main(String[] args) {
        /*
        自己处理（捕获异常）灵魂四问：
        灵魂2问：如果try中可能会遇到多个问题，怎么执行
              答：会写多个catch与之对应
              细节：如果我们要捕获多个异常，这些异常如果存在父子关系的话，那么父类一定要写在下面。

              了解性：我们可以在catch中同时捕捉多个异常，中间用|隔开。
         */

        int[] arr = {1,2,3,4,5};
        try{
            System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
            System.out.println(2/0);//ArithmeticException
        }catch (ArrayIndexOutOfBoundsException|ArithmeticException e){
            System.out.println("索引越界");
        }catch (Exception e){
            System.out.println("Exception");
        }

    }
}
