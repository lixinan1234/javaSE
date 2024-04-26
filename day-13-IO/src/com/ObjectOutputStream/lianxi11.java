package com.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/25 23:08
 */
public class lianxi11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\李新安\\Desktop\\Java代码\\xlh.txt"));
        //2.读取数据
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }
        //3.关流
        ois.close();
    }
}
