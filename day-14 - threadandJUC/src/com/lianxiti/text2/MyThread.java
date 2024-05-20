package com.lianxiti.text2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/12 14:02
 */
public class MyThread extends Thread {

    //礼物数量
    static int gift = 100;

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
            synchronized (MyThread.class) {
                //3.判断共享数据是否到了末尾，(到了末尾)
                if (gift == 10) {
                    break;
                } else {
                    //4.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    gift--;
                    System.out.println(getName() + "送出的礼物，剩余" + gift + "份礼物");
                }
            }
        }
    }
}
