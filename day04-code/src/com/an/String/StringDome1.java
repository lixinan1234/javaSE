package com.an.String;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/3 15:34
 */
public class StringDome1 {
    public static void main(String[] args) {
        //1.直接赋值的方式获取一个字符串对象
        String s1 = "abc";
        System.out.println(s1);


        //2.使用new的方法来获取一个字符串对象
        String s2 = new String();
        System.out.println("看" + s2 + "吧");


        //传递一个字符串，根据传递的字符串内容再创造一个新的字符串对象（脱裤子放屁）
        String s3 = new String("abc");
        System.out.println(s3);


        //传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        char[] chs = {'t','z','x'};
        String s4 = new String(chs);
        System.out.println(s4);


        //传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //byte
        byte[] bytes = {90,45,78,24};
        String s5 = new String(bytes);
        System.out.println(s5);

    }
}
