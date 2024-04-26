package com.File.lianxi;

import java.io.File;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/19 15:23
 */
public class test3 {
    public static void main(String[] args) {
        /*
        需求：
              找到电脑所有以avi结尾的电影
              （需要考虑子文件）

        套路：
              1.进入文件夹
              2.遍历数组
              3.判断
              4.判断


         */

        File src = new File("c:\\");
        findAVI(src);

    }

    public static void findAVI(File src){
        //1.进入文件夹
        File[] files = src.listFiles();
        //2.遍历数组,依次得到scr里面的每一个文件或者文件夹
        if(files!=null){
            for (File file : files) {
                if(file.isFile()){
                    //3.判断：如果是文件，就可以执行题目的业务逻辑
                    String name = file.getName();
                    if(name.endsWith(".avi")){
                        System.out.println(file);
                    }
                }else {
                    //4.判断：如果是文件夹，就可以递归
                    //细节：再次调用本方法的时候，参数一定是src的次一级路径
                    findAVI(file);
                }

            }
        }
    }
}
