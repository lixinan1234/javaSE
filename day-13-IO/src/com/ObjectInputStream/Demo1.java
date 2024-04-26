package com.ObjectInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/25 22:13
 */
public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\李新安\\Desktop\\Java代码\\fxlh.txt"));
        //2.读取对象
        Object o = ois.readObject();
        //3.打印对象
        System.out.println(o);
        //4.释放资源
        ois.close();
    }
}
