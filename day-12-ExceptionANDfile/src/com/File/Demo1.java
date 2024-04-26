package com.File;

import java.io.File;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/18 20:53
 */
public class Demo1 {
    public static void main(String[] args) {
        //1.根据字符串表示路径，变成File对象
        String str = "C:\\Users\\李新安\\Desktop\\Java代码\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        //2.根据父路径名字符串和子路径名字符串创建文件对象
        //父级路径:C:\Users\李新安\Desktop\Java代码
        //子级路径：a.txt
        String parent = "C:\\Users\\李新安\\Desktop\\Java代码";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        //3.把一个File表示的路径和String表示路径进行拼接
        File parent2 = new File("C:\\Users\\李新安\\Desktop\\Java代码");
        String child2 = "a.txt";
        File f4 = new File(parent2,child2);
        System.out.println(f4);
    }
}
