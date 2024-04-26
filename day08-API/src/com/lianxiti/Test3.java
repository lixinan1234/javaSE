package com.lianxiti;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/19 16:50
 */
public class Test3 {
    public static void main(String[] args) {
        //当前时间
        LocalDate today = LocalDate.now();
        //出生时间
        LocalDate birthDate = LocalDate.of(2002,7,18);

        //计算活了多少年
        System.out.println("活了"+ ChronoUnit.YEARS.between(birthDate,today)+"年");

    }
}
