package com.BufferedInputStream;

import java.io.*;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/22 22:53
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
            利用字节缓冲流拷贝文件
         */

        //1.创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\李新安\\Desktop\\Java代码\\copy.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\李新安\\Desktop\\Java代码\\paixu.txt"));
        //2.拷贝
        int len;
        byte[] bytes =new byte[1024];
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
