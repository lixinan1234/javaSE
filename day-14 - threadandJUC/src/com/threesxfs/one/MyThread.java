package com.threesxfs.one;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/7 22:34
 */
public class MyThread extends Thread{
    @Override
    public void run() {
       //书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"HelloWorld");
        }
    }
}
