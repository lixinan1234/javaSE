package com.ObjectOutputStream;

import java.io.*;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/25 21:49
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
            需求：利用序列化流/对象操作输出流，把一个对象写到文本文件中
         */

        //1.创建学生对象
        Student s = new Student("李新安",23,"jiangxi");

        //2.创建序列化流的对象
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("C:\\Users\\李新安\\Desktop\\Java代码\\fxlh.txt"));
        //3.写出数据
        oos.writeObject(s);

        //4.释放资源
        oos.close();

    }
}
