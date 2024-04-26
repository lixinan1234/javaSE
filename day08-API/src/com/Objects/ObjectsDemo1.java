package com.Objects;

import java.util.Objects;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/13 10:11
 */
public class ObjectsDemo1 {
    public static void main(String[] args) {

        //Objects.equals 先做非空判断，比较两个对象
        //1.创建学生对象
        Student stu1 = null;
        Student stu2 = new Student("zhangsan",23);

        boolean equals = Objects.equals(stu1, stu2);
        System.out.println(equals);


        //Objects.isNull 判断对象是否位Null,为null返回true,反之位false
        Student stu3 = null;
        Student stu4 = new Student("zhangsan",23);
        System.out.println(Objects.isNull(stu3));//true
        System.out.println(Objects.isNull(stu4));//false
    }
}
