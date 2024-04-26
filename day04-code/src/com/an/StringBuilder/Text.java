package com.an.StringBuilder;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/6 15:05
 */
public class Text {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //容器：最多装多少
        //长度：已经装了多少
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0


//        sb.append("abcdefghijklmnopqrstuvwxyz");
//        System.out.println(sb.capacity());//34
//        System.out.println(sb.length());//26



        sb.append("abcdefghijklmnopqrstuvwxyz0123456789");
        System.out.println(sb.capacity());//36
        System.out.println(sb.length());//36


    }
}
