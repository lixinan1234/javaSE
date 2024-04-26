package com.duotai;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/3 10:51
 */
public class Teacher extends person{
    @Override
    public void show() {
        System.out.println("老师的信息为："+getName()+", "+getAge());
    }
}
