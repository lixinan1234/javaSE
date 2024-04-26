package com.duotai;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/3 10:53
 */
public class Administrator extends person{
    @Override
    public void show() {
        System.out.println("管理员的信息为："+getName()+", "+getAge());
    }
}
