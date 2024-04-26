package com.FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/20 21:55
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
                 一次读一个字节的数组数据
         */

        //1.创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\李新安\\Desktop\\Java代码\\xdy\\hhh.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\李新安\\Desktop\\Java代码\\copy.txt");
        //2.拷贝
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        //3.释放资源
        fos.close();
        fis.close();
    }
}
