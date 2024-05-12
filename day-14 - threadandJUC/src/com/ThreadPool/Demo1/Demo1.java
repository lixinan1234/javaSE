package com.ThreadPool.Demo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/12 21:53
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
             newCachedThreadPool 创建一个没有上线的线程池
             newFixedThreadPool 创建有上限的线程池
         */

        //1.获取线程池的对象
        ExecutorService pool1 = Executors.newCachedThreadPool();

        //2.提交任务
        pool1.submit(new MyRunnable());

        //3.销毁线程池
        pool1.shutdown();
    }
}
