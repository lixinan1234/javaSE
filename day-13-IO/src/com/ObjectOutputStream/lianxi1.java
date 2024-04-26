package com.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/25 23:00
 */
public class lianxi1 {
    public static void main(String[] args) throws IOException {
        /*
             需求：
                   将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢？
         */

        //1.序列化多个对象
        Student s1 = new Student("李新安",23,"江西");
        Student s2 = new Student("廖乐乐",24,"江西");
        Student s3 = new Student("张三丰",67,"北京");
        //2.定义一个集合，并把Student添加进去
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //3.创建序列化流的对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\李新安\\Desktop\\Java代码\\xlh.txt"));
        //4.写出
        oos.writeObject(list);
        //5.关流
        oos.close();

    }
}
