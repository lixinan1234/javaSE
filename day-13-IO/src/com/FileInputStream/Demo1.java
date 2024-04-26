package com.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/20 16:11
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
        演示：字节输入流FileInputStream

        实现需求：读取文件中的数据。

        实现步骤：
                创建文件
                读取数据
                释放资源
         */

        //1.创建数据
        FileInputStream fis = new FileInputStream("C:\\Users\\李新安\\Desktop\\Java代码\\b.txt");
        //2.读取数据
        int b;
        while ((b=fis.read())!=-1){
            System.out.println((char)b);
        }
        //3.释放资源
        fis.close();
    }
}
