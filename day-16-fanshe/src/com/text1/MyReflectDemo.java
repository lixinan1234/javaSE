package com.text1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/19 20:38
 */
public class MyReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        /*
              对于任意一个对象，都可以把对象的所有字段名和值，保存到文件中去
         */

        Student s = new Student("李新安",23,'男',175.0,"睡觉");
        Teacher t = new Teacher("波妞",30000);

        saveObject(s);
    }


    //把对象里面所有的成员变量名和值保存到本地文件
    public static void saveObject(Object obj) throws IllegalAccessException, IOException {
        //1.获取字节码文件的对象
        Class clazz = obj.getClass();

        //2.创建IO流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day-16-fanshe\\a.txt"));

        //3.获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            //因为不知道哪些是私有的
            //取消临时访问权限
            field.setAccessible(true);
            //获取成员变量的名字
            String name = field.getName();
            //获取成员变量的值
            Object value = field.get(obj);
            //写出数据
            bw.write(name + "=" +value);
            bw.newLine();
        }

        bw.close();


    }

}
