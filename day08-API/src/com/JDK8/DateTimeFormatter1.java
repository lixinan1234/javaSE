package com.JDK8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/17 11:23
 */
public class DateTimeFormatter1 {
    public static void main(String[] args) {
        //获取时间对象
        ZonedDateTime z = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        //解析/格式化器
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //格式化
        System.out.println(dateTimeFormatter1.format(z));


    }
}
