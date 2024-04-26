package com.HashMap.lianxi1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/8 19:29
 */
public class test {
    public static void main(String[] args) {
        /*
        需求：创建一个HashMap集合，键是学生对象（Student）,值是籍贯（String）。
        存储三个键值对元素，并遍历
        要求：同姓名，同年龄认为是一个学生。
         */

        //创建三个学生对象
        Student s1 = new Student("李新安",18);
        Student s2 = new Student("廖乐乐",19);
        Student s3 = new Student("廖乐乐",19);

        //1.创建一个集合
        Map<Student,String> map = new HashMap<>();
        //2.添加键值对元素
        map.put(s1,"江西");
        map.put(s2,"江西");
        map.put(s3,"上海");

        //3.遍历集合
        map.forEach((student,  s)-> System.out.println(student+"="+s));

        System.out.println("-------------------------------");

        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

        System.out.println("----------------------------");

        Set<Student> students = map.keySet();
        for (Student student : students) {
            String s = map.get(student);
            System.out.println(student+"="+s);
        }

    }
}
