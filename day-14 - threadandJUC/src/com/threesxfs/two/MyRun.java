package com.threesxfs.two;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/7 22:56
 */
public class MyRun implements Runnable{
    @Override
    public void run() {
        //书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            //获取到当前线程的对象
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+"HelloWord");
        }
    }
}
