package com.File.lianxi;

import java.io.File;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/19 14:49
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        /*
        需求：
               在当前模块下的aaa文件夹中创建一个a.txt
         */

        //1.创建Files对象
        File f = new File("lianxi\\aaa");
        //2.创建父级路径
        //如果aaa是存在的，那么创建失败
        //如果aaa是不存在的，那么创建成功
        f.mkdirs();
        File src = new File(f,"b.txt");
        boolean newFile = src.createNewFile();
        if(newFile){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }


    }
}
