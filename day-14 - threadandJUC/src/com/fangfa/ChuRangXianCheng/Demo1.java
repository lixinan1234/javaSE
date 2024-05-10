package com.fangfa.ChuRangXianCheng;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/10 20:31
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
             yield  出让线程
            细节：让两个线程打印的尽量均匀点
         */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("飞机");
        t2.setName("坦克");

        t1.start();
        t2.start();
    }
}
