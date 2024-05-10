package com.fangfa.er;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/9 17:30
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
              SetPriority    设置线程的优先级
              getPriority    获取线程的优先级
         */


        //创建线程要执行的参数对象
        MyThread m = new MyThread();
        //创建线程对象
        Thread t1 = new Thread(m,"飞机");
        Thread t2 = new Thread(m,"坦克");

        t1.setPriority(1);//设置线程的优先级1~10之间
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
