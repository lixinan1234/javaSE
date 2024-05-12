package com.lianxiti.text1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/12 13:39
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
             一共有1000张电影票，可以在两个窗口领取，假设每次领取时间为3000毫秒，
             要求：请用多线程模拟卖票过程并打印剩余电影票的数量
         */

        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        m1.setName("窗口1");
        m2.setName("窗口2");

        m1.start();
        m2.start();
    }
}
