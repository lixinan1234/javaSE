package com.JDK8;

import java.time.ZoneId;
import java.util.Set;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/17 10:52
 */
public class ZoneId1 {
    public static void main(String[] args) {

        //1.获取所有的时区名称
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds.size());
        System.out.println(availableZoneIds);

        //2.获取当前系统的默认时间
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

    }
}
