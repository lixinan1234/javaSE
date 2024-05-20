package com.lianxiti.text3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/12 14:15
 */
public class MyThread implements Runnable {
    //第二种方式实现多线程，测试类中MyRunable只创建一次，所以不需要加static
    int number = 1;

    @Override
    public void run() {
        //1.循环
        while (true) {
            //2.同步代码块
            synchronized (MyThread.class) {
                //3.判断共享数据是否到了末尾，(到了末尾)
                if (number > 100) {
                    break;
                } else {
                    //4.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
                    if (number % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() +"打印数字"+ number);
                    }
                    number++;
                }
            }
        }
    }
}
