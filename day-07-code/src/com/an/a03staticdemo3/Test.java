package com.an.a03staticdemo3;

import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/21 16:07
 */
public class Test {
    public static void main(String[] args) {


        //1.创建一个集合存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        //2.创建3个学生对象
        Student stu1 = new Student("李新安",22,"男");
        Student stu2 = new Student("廖乐乐",23,"男");
        Student stu3 = new Student("张三",25,"男");

        //3.把学生对象添加到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //4.获取最大学生的年龄
        int max = StudentUtil.Max(list);
        System.out.println("年龄最大的是"+max);
    }
}
