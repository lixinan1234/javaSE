package com.lianxiti.text2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/12 14:01
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
            有100份礼品，两人同时发送，当剩下的礼品小于10份的时候则不再送出。
            利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来
         */

        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        m1.setName("孙悟空");
        m2.setName("贝吉塔");

        m1.start();
        m2.start();

    }
}
