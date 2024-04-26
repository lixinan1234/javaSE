package com.Exception;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/17 20:37
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        JVM默认处理的异常方式：
        1.把异常的名称，异常的原因以及异常出现的位置等信息输出在了控制台。
        2.程序停止执行，异常的代码不会再执行
         */

        System.out.println("1233123");
        System.out.println(2/0);
        System.out.println("1233123");
        System.out.println("1233123");
    }
}
