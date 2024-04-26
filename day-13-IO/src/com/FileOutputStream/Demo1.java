package com.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/20 14:39
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
        演示：字节输出流FileOutputStream
        实现需求：写出一段文字到本地文件中（暂时不写中文）

        实现步骤：
                创建对象
                写出数据
                释放资源
         */

        //1.创建对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\李新安\\Desktop\\Java代码\\a.txt");

        //2.写出数据
        fos.write(97);
        //3.释放资源
        fos.close();
    }
}
