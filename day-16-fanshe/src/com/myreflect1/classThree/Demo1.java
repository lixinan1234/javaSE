package com.myreflect1.classThree;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/17 14:42
 */
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
            获取class对象的三种方式：
              1.Class.forName("全类名")
              2.类名
         */

        //1.第一种方法
        //全类名： 包名 + 类名
        Class clazz1 = Class.forName("com.myreflect1.classThree.Student");

        //打印
        System.out.println(clazz1);

        //2.第二种方法
        Class<Student> clazz2 = Student.class;
        System.out.println(clazz1 == clazz2);

        //3.第三种方式
        Student s = new Student();
        Class<? extends Student> clazz3 = s.getClass();
        System.out.println(clazz1 == clazz3);

    }
}
