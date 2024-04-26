package com.TreeMap;

import java.util.TreeMap;
import java.util.function.BiConsumer;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/8 21:02
 */
public class TreeMap2 {
    public static void main(String[] args) {
        /*
        需求2：
        键：学生对象
        值：籍贯
        要求：按照学生的年龄的升序进行排列，年龄一样按照姓名的字母进行排列，姓名年龄都相同就视为同一个人。
         */

        //1.创建3个学生对象
        Student s1 = new Student("lele",18);
        Student s2 = new Student("anan",18);
        Student s3 = new Student("hanhan",20);
        Student s4 = new Student("hanhan",20);
        //2.创建TreeMap集合对象
        TreeMap<Student,String> tm = new TreeMap<>();
        tm.put(s1,"江西");
        tm.put(s2,"上饶");
        tm.put(s3,"日本");
        tm.put(s4,"日本");
        //3.打印集合
        tm.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student+"="+s);
            }
        });
    }
}
