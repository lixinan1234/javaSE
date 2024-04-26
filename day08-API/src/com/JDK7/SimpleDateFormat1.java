package com.JDK7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/12 20:53
 */
public class SimpleDateFormat1 {
    public static void main(String[] args) throws ParseException {
        //1.利用空参构造创建SimpleDateFormat对象，默认格式
        SimpleDateFormat s1 = new SimpleDateFormat();
        Date d = new Date();
        String format = s1.format(d);
        System.out.println(format);


        //2.利用带参构造创建SimpleDateFormat对象，指定格式
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy年mm月dd日 hh:mm:ss EE");
        String format1 = s2.format(d);
        System.out.println(format1);


        //3.解析
        //1.定义一个字符串表示时间
        String str = "2023-11-11 11:11:11";
        //2.利用带参构造创建SimpleDateFormat对象
        SimpleDateFormat s3 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date parse = s3.parse(str);
        System.out.println(parse.getTime());
    }
}
