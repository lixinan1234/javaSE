package com.JDK7;

import java.util.Calendar;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/16 22:55
 */
public class Calendar1 {
    public static void main(String[] args) {

        //1.获取日历对象
        //细节：Calendar是一个抽象类，不能直接new，而是通过静态方法获取到子类对象。
        Calendar c = Calendar.getInstance();

        //2.修改一下日历代表的时间
//        Date d = new Date();
//        c.setTime(d);
//        System.out.println(c);


        //4.修改年份
        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONDAY,7);
        c.set(Calendar.DAY_OF_MONTH,10);

        //5.调用方法在这个基础上增加一个月
        c.add(Calendar.MONDAY,1);


        //3. 获取日期中的某个字段信息
        int year = c.get(1);
        int month = c.get(2);
        int date = c.get(5);
        System.out.println(year + "," + month + "," + date);




    }
}
