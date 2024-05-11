package com.waitandontify;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/11 21:40
 */
public class ThreadDemo {
    public static void main(String[] args) {
        /*
             需求：
                   完成生产者和消费者（等待唤醒机制）的代码
                   实现线程轮流交替执行的效果
         */

        //创建线程对象
        Cook c = new Cook();
        Foodie f = new Foodie();

        //开启线程
        c.start();
        f.start();
    }
}
