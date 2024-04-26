package com.Runtime;

import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/12 14:21
 */
public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {

        //1.获取Runtime的对象
        //Runtime r = Runtime.getRuntime();

        //2.exit   停止虚拟机
        //Runtime r = Runtime.getRuntime();
        //r.exit(0);
        //System.out.println("看看我执行了吗？");

        //3.获取cpu的线程数
        //System.out.println(Runtime.getRuntime().availableProcessors());

        //4.总内存大小 单位byte
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //5.已经获取的总内存大小，单位byte
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        //6.剩余的总内存大小，单位byte
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        //7.运行CMD命令
        //shutdown:关机
        //加上参数后才能运行
        //-s :默认在一分钟后关机
        //-s -t 指定时间 ：指定关机时间
        //-a ：取消关机操作
        //-r :关机重启
        Runtime.getRuntime().exec("shutdown -a");
    }
}
