package com.an.String;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/3 16:21
 */
public class StringDemo2 {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String s1 = new String("abc");
        String s2 = "ABC";

        //2.==号比较
        //基本数据类型比较的是数据值
        //引用数据类型比较的是地址值
        System.out.println(s1 == s2);

        //3.比较字符串对象中的内容是否相等
        boolean equals1 = s1.equals(s2);//比较s1和s2的内容
        System.out.println(equals1);

        //4.比较字符串对象中的内容是否相等，忽略大小写
        boolean  equals2= s1.equalsIgnoreCase(s2);
        System.out.println(equals2);
    }
}
