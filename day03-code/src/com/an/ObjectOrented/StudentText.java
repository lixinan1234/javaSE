package com.an.ObjectOrented;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/10/29 14:45
 */
public class StudentText {
    public static void main(String[] args) {
        Student p1 = new Student("李新安",18,180.00);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getHeight());
    }
}
