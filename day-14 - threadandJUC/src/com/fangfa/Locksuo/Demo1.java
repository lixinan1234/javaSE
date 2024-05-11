package com.fangfa.Locksuo;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/11 21:06
 */
public class Demo1 {
    public static void main(String[] args) {
        /*

             需求：
                  某电影院目前正在上映国产大片，共有100张票，而他它有3个窗口，请设计一个程序模拟该电影院卖票
                  用JDK5的lock锁实现

         */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();


    }
}
