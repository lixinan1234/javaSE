package com.fangfa.lianxi;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/10 21:06
 */
public class MyThread extends Thread {

    //表示这个类所有的对象，都共享ticket数据
    static int ticket = 0;

    //锁对象
    //细节：一定是唯一的
    //static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //同步代码块
            //细节：synchronized要写在循环的里面
            synchronized (MyThread.class) {
                if (ticket < 100) {
                    ticket++;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else {

                    break;
                }
            }
        }
        System.out.println("售卖完了");
    }
}
