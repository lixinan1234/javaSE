package com.File.lianxi;

import java.io.File;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/19 22:38
 */
public class test5 {
    public static void main(String[] args) {
        /*
        需求：
              统计一个文件夹的总大小


         */

        File src = new File("C:\\Users\\李新安\\Desktop\\Java代码\\10");

        long len = getLen(src);
        System.out.println(len);
    }

    /*
    作用：统计文件夹的总大小
    参数：表示要统计的那个文件
    返回值：统计之后的结果

         套路：
              1.进入文件夹
              2.遍历数组
              3.判断
              4.判断

     */
    public static long getLen(File src) {
        //1.定义变量进行累加
        long len = 0;
        //进入文件夹
        File[] files = src.listFiles();
        //遍历数组
        for (File file : files) {
            //判断
            if (file.isFile()) {
                //判断,把当前文件累加到len中
                len = len + file.length();
            } else {
                //判断不是文件就递归
                len = len + getLen(file);
            }
        }
        return len;
    }
}
