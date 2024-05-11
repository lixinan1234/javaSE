package com.waitandontify;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/11 21:41
 */
public class Cook extends Thread {
    @Override
    public void run() {
       /*
        1.循环
        2.同步代码块（同步方法）
        3.判断共享数据是否到了末尾，(到了末尾)
        4.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
        */


        //1.循环
        while (true) {
            //2.同步代码块（同步方法）
            synchronized (Desk.lock) {
                //3.判断共享数据是否到了末尾，(到了末尾)
                if (Desk.count == 0) {
                    break;
                } else {
                    //4.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
                    //判断桌子上是否有食物
                    if (Desk.foodFlag == 1) {
                        //有：等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //没有：制作食物
                        System.out.println("厨师做了一碗面条");
                        //把食物放在桌子上
                        Desk.foodFlag = 1;
                        //叫醒等待的消费者开吃
                        Desk.lock.notifyAll();
                    }
                }
            }
        }


    }
}
