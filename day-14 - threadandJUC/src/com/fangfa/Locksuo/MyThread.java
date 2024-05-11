package com.fangfa.Locksuo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/11 21:06
 */
public class MyThread extends Thread{
    //表示这个类所有的对象，都共享ticket数据
    static int ticket = 0;

    static  Lock lock = new ReentrantLock();

    @Override
    public void run() {
        //1.循环
        while (true) {
            //2.同步代码块
            lock.lock();
            try {
                //3.判断共享数据是否到了末尾，如果到了末尾
                if (ticket == 100) {
                    break;
                    //4.判断共享数据是否到了末尾，如果没用到末尾
                } else {

                        Thread.sleep(100);

                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}
