package com.fangfa.TongBuFangFa;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/10 22:12
 */
public class ThreadDemo{
    public static void main(String[] args) {

        MyRunnable m = new MyRunnable();

        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

}
