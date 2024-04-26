package com.File.lianxi;

import java.io.File;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/19 22:11
 */
public class test4 {
    public static void main(String[] args) {
        /*
              删除一个多级文件夹
              如果我们要删除一个有内容的文件夹
              1.先删除文件夹里面所有的内容
              2.再删除自己

         套路：
              1.进入文件夹
              2.遍历数组
              3.判断
              4.判断
         */

        File src = new File("C:\\Users\\李新安\\Desktop\\Java代码\\vvv");
        sc(src);


    }
    public static void sc (File src){
        //1.先删除文件夹里面所有的内容
        //进入文件夹
        File[] files = src.listFiles();
        //遍历数组
        for (File file : files) {
            if(file.isFile()){
                //判断：如果是文件，就可以执行题目的业务逻辑（删除）
                file.delete();
            }else {
                //判断：如果是文件夹，就可以递归
                sc(file);
            }


        }
        //2.再删除自己
        src.delete();
    }
}
