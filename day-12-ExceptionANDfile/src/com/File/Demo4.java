package com.File;

import java.io.File;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/19 14:12
 */
public class Demo4 {
    public static void main(String[] args) {
        //listFiles() 获取当前路径下所有内容
        //1.创建Files对象
        File f = new File("C:\\Users\\李新安\\Desktop\\Java代码\\vvv");
        //2.listFiles方法
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
