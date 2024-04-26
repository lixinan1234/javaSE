package com.huancholiulianxi2;

import java.io.*;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/24 9:22
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
            拷贝文件：
            四种方式拷贝文件，并统计各自使用时间

            1.字节流的基本流：一次读写一个字节
            2.字节流的基本流：一次读写一个字节数组
            3.字节缓冲流：一次读写一个字节
            4.字节缓冲流：一次读写一个字节数组
         */

        long start = System.currentTimeMillis();
        //method2();
        method3();
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000.0+"秒");



    }
    public static void method2() throws IOException {
        //2.字节流的基本流：一次读写一个字节数组
        FileInputStream fis = new FileInputStream("C:\\Users\\李新安\\Desktop\\Java代码");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\李新安\\Desktop");
        int len;
        byte[] bytes = new byte[8192];
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }

    public static void method3() throws IOException {
        //2.字节流的基本流：一次读写一个字节数组
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("C:\\Users\\李新安\\Desktop\\Java代码\\copy.txt"));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\李新安\\Desktop\\Java代码\\b.txt"));
        int len;
        byte[] bytes = new byte[8192];
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
