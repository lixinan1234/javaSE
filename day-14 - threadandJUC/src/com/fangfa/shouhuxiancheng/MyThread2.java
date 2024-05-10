package com.fangfa.shouhuxiancheng;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/10 20:18
 */
public class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
