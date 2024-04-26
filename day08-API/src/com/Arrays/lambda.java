package com.Arrays;

import java.util.Arrays;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/26 14:11
 */
public class lambda {
    public static void main(String[] args) {
        //升序降序
        //o1-o2升序
        //o2-o1降序
        Integer[] arr3 = {1,3,2,6,9,7,10};
        Arrays.sort(arr3, (Integer o1, Integer o2)-> {
                return o1-o2;

        });
        System.out.println(Arrays.toString(arr3));


        //使用lambda表达式
        method(()-> {
                System.out.println("我在跑步");
            }
        );

    }

    public static void method(Swim s){
        s.swimming();
    }




}


interface Swim{
    public abstract void swimming();
}


