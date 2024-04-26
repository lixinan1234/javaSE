package com.duotai;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/3 10:49
 */
public class student extends person{
    @Override
    public void show() {
        System.out.println("学生的信息为："+getName()+", "+getAge());
    }
}
