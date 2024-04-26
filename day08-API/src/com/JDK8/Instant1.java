package com.JDK8;

import java.time.Instant;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/17 11:02
 */
public class Instant1 {
    public static void main(String[] args) {

        //1.获取当前时间的Instant的对象（标准时间）
        Instant now = Instant.now();
        System.out.println(now);

    }
}
