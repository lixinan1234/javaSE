package com.fangfa.TongBuFangFa;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/10 22:12
 */
public class MyRunnable implements Runnable {
    int ticket = 0;

    @Override
    public void run() {


        //1.循环
        while (true) {
            //2.同步代码块（同步方法）
                if (method()) break;
        }
    }

    private synchronized boolean method() {
        //3.判断共享数据是否到了末尾，如果到了末尾
        if (ticket == 100) {
            return true;
            //4.判断共享数据是否到了末尾，如果没用到末尾
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
        }
        return false;
    }

}
