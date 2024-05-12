package com.lianxiti.text4case1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/12 14:43
 */
public class Demo1 {
    public static void main(String[] args) {
           /*
            微信中的抢红包也用到了多线程。
            假设：100块，分成了3个包，现在有5个人去抢。
            其中，红包是共享数据。
            5个人是5条线程。
            打印结果如下：
            	XXX抢到了XXX元
            	XXX抢到了XXX元
            	XXX抢到了XXX元
            	XXX没抢到
            	XXX没抢到
        */

           MyThread m1 = new MyThread();
           MyThread m2 = new MyThread();
           MyThread m3 = new MyThread();
           MyThread m4 = new MyThread();
           MyThread m5 = new MyThread();

           m1.setName("孙悟空");
           m2.setName("贝吉塔");
           m3.setName("费利萨");
           m4.setName("比克");
           m5.setName("布欧");

           m1.start();
           m2.start();
           m3.start();
           m4.start();
           m5.start();


    }
}
