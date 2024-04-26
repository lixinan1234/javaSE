package com.xin.ArrayList;

import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/13 14:37
 */
public class ArrayListDemo4 {
    public static void main(String[] args) {
        //需求：定义一个集合，添加一些学生对象，并进行遍历
        //      学生类的属性为：姓名，年龄。



        //1.定义一个集合
        ArrayList<ArrayListDemo4Student> list = new ArrayList<>();

        //2.创建学生对象
        ArrayListDemo4Student s1 = new ArrayListDemo4Student("廖乐乐",18);
        ArrayListDemo4Student s2 = new ArrayListDemo4Student("李新安",18);
        ArrayListDemo4Student s3 = new ArrayListDemo4Student("张三",38);

        //3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //3.遍历
        for (int i = 0; i < list.size(); i++) {
            ArrayListDemo4Student arrayListDemo4Student = list.get(i);
            System.out.println(arrayListDemo4Student.getName() + ", " +arrayListDemo4Student.getAge());
        }
    }
}
