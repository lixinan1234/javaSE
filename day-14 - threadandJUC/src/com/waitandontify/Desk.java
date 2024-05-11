package com.waitandontify;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/11 21:43
 */
public class Desk {

    /*
         作用：控制生产者和消费者的执行
     */

    //是否有面条    0：没用面条 1：用面条
    public static int foodFlag = 0;

    //总个数
    public static int count = 10;

    //锁对象
    public static Object lock = new Object();

}
