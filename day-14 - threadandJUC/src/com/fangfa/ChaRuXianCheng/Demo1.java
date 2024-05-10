package com.fangfa.ChaRuXianCheng;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/10 20:40
 */
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        /*

             join 插入线程
             //把插入的线程先执行
         */

        MyThread t1 = new MyThread();
        t1.setName("土豆");
        t1.start();
        //表示把t1这个线程，插入到当前线程之前
        t1.join();
        //执行main线程当中的
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程"+i);
        }

    }
}
