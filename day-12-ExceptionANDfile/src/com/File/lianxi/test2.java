package com.File.lianxi;

import java.io.File;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/19 15:10
 */
public class test2 {
    public static void main(String[] args) {
        /*
        需求：
            定义一个方法找某一个文件夹，是否有以avi结尾的电影
            （暂不考虑子文件夹）
         */

        File f1 = new File("C:\\Users\\李新安\\Desktop\\Java代码");
        boolean b = haveAVI(f1);
        System.out.println(b);

    }

    //作用：用来找某一个文件夹，是否有以avi结尾的电影
    //形参：要查找的文件夹
    //返回值：查找的结果 存在true 不存在false
    private static boolean haveAVI(File file) {
        //1.进入aaa文件夹，而且要获取里面所有的内容
        File[] files = file.listFiles();
        //2.循环遍历里面每一个元素
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".txt")) {
                return true;
            }
        }
        //3.如果循环结束后还没找到，直接返回false
        return false;
    }
}
