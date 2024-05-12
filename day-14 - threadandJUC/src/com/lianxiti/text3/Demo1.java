package com.lianxiti.text3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/12 14:15
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
             同时开启两个线程，共同获取1~100之间的所有数字
             要求：将输出所有的奇数
         */

        MyThread m1 = new MyThread();

        Thread t1 = new Thread(m1,"线程1");
        Thread t2 = new Thread(m1,"线程2");

        t1.start();
        t2.start();


    }
}
