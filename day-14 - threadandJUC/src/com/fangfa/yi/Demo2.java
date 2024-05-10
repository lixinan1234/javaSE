package com.fangfa.yi;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/9 17:28
 */
public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        /*

            static void sleep 让线程休眠指定的时间，单位毫秒

         */

        System.out.println("我睡觉了");
        Thread.sleep(5000);
        System.out.println("我睡醒了");
    }
}
