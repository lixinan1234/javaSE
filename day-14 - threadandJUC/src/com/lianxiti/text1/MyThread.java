package com.lianxiti.text1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/12 13:39
 */
public class MyThread extends Thread{

    static int mun = 0;
    static int shengyu = 1000;

    @Override
    public void run() {
           /*
        1.循环
        2.同步代码块（同步方法）
        3.判断共享数据是否到了末尾，(到了末尾)
        4.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
        */

        // 1.循环
        while (true){
            //2.同步代码块（同步方法）
            synchronized (MyThread.class){
                //3.判断共享数据是否到了末尾，(到了末尾)
                if(mun==1000){
                    break;
                }else {
                    //4.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    mun++;
                    shengyu--;
                    System.out.println(getName()+"卖了第"+mun+"张门票,"+"剩余"+shengyu+"张");
                }
            }
        }
    }
}
