package com.an.ObjectOrentedlianxi2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/1 16:57
 */
public class Student {
    private int son;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int son, String name, int age) {
        this.son = son;
        this.name = name;
        this.age = age;
    }

    public int getSon() {
        return son;
    }

    public void setSon(int son) {
        this.son = son;
    }

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
