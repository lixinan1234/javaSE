package com.xin.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/13 14:40
 */
public class ArrayListDemo4Student {
    //私有化成员变量

    private String name;
    private int age;

    //空参构造方法
    public ArrayListDemo4Student() {
    }
    //带全部参数的构造方法
    public ArrayListDemo4Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //get/set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
