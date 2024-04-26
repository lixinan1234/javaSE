package com.an.StringJoiner;

import java.util.StringJoiner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/5 13:02
 */
public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //1.创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");

        //2.添加元素
        sj.add("abc").add("aaa").add("bbb");
        System.out.println(sj);
    }
}
