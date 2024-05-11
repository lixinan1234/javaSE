package com.waitandontify2;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/11 22:46
 */
public class Foodie extends Thread{

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            //不断的把面条放到阻塞队列当中
            try {
                String food = queue.take();
                System.out.println(food );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
