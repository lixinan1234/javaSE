package com.waitandontify;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/11 21:42
 */
public class Foodie extends Thread {
    @Override
    public void run() {
      /*
        1.循环
        2.同步代码块（同步方法）
        3.判断共享数据是否到了末尾，如果到了末尾
        4.判断共享数据是否到了末尾，(没用到末尾，执行核心逻辑)
       */

        //1.循环
        while (true) {
            //2.同步代码块（同步方法）
            synchronized (Desk.lock) {
                //3.判断共享数据是否到了末尾，如果到了末尾
                if (Desk.count == 0) {
                    break;
                } else {
                    //4.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
                    //判断桌子上是否有食物
                    if (Desk.foodFlag == 0) {
                        //如果没有就等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //把吃的总数-1
                        Desk.count--;
                        //如果有就开吃
                        System.out.println("吃货开吃！！还能吃" + Desk.count + "碗");
                        //吃完之后，唤醒厨师继续做
                        Desk.lock.notifyAll();
                        //修改桌子的状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
