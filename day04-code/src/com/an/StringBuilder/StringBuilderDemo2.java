package com.an.StringBuilder;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/5 11:53
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();

        //2.添加字符串
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        //链式编程（小技巧）
        sb.append("aaa").append("bbb").append("ccc").append("ddd");

        //3.再把StringBuilder变回字符串
        String s = sb.toString();
        System.out.println();
    }
}
