package com.threesxfs.three;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/9 16:07
 */
public class Demo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*

             多线程的第三种实现方式：
                 特点：可以获取到多线程运行的结果

                 1.创建一个类MyCallable实现Callable接口
                 2.重写call (是有返回值的，表示多线程运行的结果)

                 3.创建MyCallable的对象（表示多线程要执行的任务）
                 4.创建FutureTask的对象（作用管理多线程运行的结果）
                 5.创建Thread类的对象，并启动（表示线程）


         */

        //创建MyCallable的对象（表示多线程要执行的任务）
        MyCallable m = new MyCallable();

        //创建Future的对象，并启动（作用管理多线程运行的结果）
        Future<Integer> f = new FutureTask<>(m);

        //创建Thread类的对象
        Thread t = new Thread((Runnable) f);

        //启动线程
        t.start();

        //获取多线程的合
        Integer result = f.get();
        System.out.println(result);


    }
}
