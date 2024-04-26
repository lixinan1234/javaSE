package com.JDK7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/12 20:57
 */
public class SimpleDateFormatLianXi {
    public static void main(String[] args) throws ParseException {
        //生日：2002-07-18
        //请用字符串表示这个数据，并将其转换为：2002年07月18日

        //1.可以通过2000-11-11进行解析，解析成一共Date对象
        String str = "2002-07-18";
        //2.解析
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-mm-dd");
        Date date = s1.parse(str);
        //3.格式化
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy年mm月dd日");
        String format = s2.format(date);
        System.out.println(format);



    }
}
