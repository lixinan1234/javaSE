package com.xin.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/13 14:55
 */
public class ArrayListDemo5 {
    public static void main(String[] args) {
        //需求：定义一个集合，添加一些学生对象，并进行遍历
        //      学生类的属性为：姓名，年龄。
        //      用键盘录入的方式


        //1.创建集合
        ArrayList<ArrayListDemo4Student> list = new ArrayList<>();

        //2.键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //创建学生对象
            ArrayListDemo4Student s1 = new ArrayListDemo4Student();//要写在for循环里面

            //键盘录入
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();

            //把mame/age放到学生对象中
            s1.setName(name);
            s1.setAge(age);

            //把学生对象放入集合
            list.add(s1);
        }


        //5.遍历
        for (int i = 0; i < list.size(); i++) {
            ArrayListDemo4Student arrayListDemo4Student = list.get(i);
            System.out.println(arrayListDemo4Student.getName() + ", " + arrayListDemo4Student.getAge());
        }
    }
}
