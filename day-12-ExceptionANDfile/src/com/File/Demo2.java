package com.File;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/18 21:23
 */
public class Demo2 {
    public static void main(String[] args) {
        //1.对一个文件的路径进行判断
        File f1 = new File("C:\\Users\\李新安\\Desktop\\Java代码\\a.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        System.out.println("===================================================");

        //2.对一个文件夹的路径进行判断
        File f2 = new File("C:\\Users\\李新安\\Desktop\\Java代码");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());

        System.out.println("==================================================");

        //3.对一个不存在的路径进行判断
        File f3 = new File("C:\\Users\\李新安\\Desktop\\Java代码\\b.txt");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());

        System.out.println("==================================================");

        //4.length 返回文件的大小（字节数量）
        //细节：这个方法无法获取文件夹的大小
        File f4 = new File("C:\\Users\\李新安\\Desktop\\Java代码\\a.txt");
        System.out.println(f4.length());

        System.out.println("==================================================");

        //5.getAbsolutePath 返回文件的绝对路径
        File f5 = new File("C:\\Users\\李新安\\Desktop\\Java代码\\a.txt");
        String absolutePath = f5.getAbsolutePath();
        System.out.println(absolutePath);

        System.out.println("==============================================");

        //6.getName 返回文件的名称和带后缀
        File f6 = new File("C:\\Users\\李新安\\Desktop\\Java代码\\a.txt");
        String name = f6.getName();
        System.out.println(name);


        System.out.println("================================");
        //7.lastModified  返回文件的最后修改时间
        File f7 = new File("C:\\Users\\李新安\\Desktop\\Java代码\\a.txt");
        long l = f7.lastModified();
        System.out.println(l);

        SimpleDateFormat s = new SimpleDateFormat("yyyy年mm月dd日 hh:mm:ss");
        String format = s.format(l);
        System.out.println(format);

    }
}
