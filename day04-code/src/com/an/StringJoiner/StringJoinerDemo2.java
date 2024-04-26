package com.an.StringJoiner;

import java.util.StringJoiner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/5 13:22
 */
public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //创建对象
        StringJoiner sj = new StringJoiner(",","[","]");

        //2.添加数据
        sj.add("a").add("b").add("c");
        System.out.println(sj);
    }
}
