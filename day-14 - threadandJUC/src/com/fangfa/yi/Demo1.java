package com.fangfa.yi;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/9 17:13
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
            String getName 返回此线程的名称
            void setName   设置线程的名字
            static void sleep 让线程休眠指定的时间，单位毫秒
         */

        //1.创建线程的对象
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("坦克");

        //2.开启线程
        t1.start();
        t2.start();
    }
}
