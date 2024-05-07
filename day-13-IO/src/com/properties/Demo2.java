package com.properties;

import java.io.*;
import java.util.Properties;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/7 20:52
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
             Properties跟IO流结合的操作
         */

        //1.创建集合的对象
        Properties pro = new Properties();
        //2.添加数据
        pro.put("aaa","123");
        pro.put("bbb","123");
        pro.put("ccc","123");

        //3.把集合中的数据以键值对的形式写到本地文件当中
        BufferedWriter bw =new BufferedWriter(new FileWriter("day-13-IO\\a.properties"));
        pro.store(bw,"text");//写入
        bw.close();

    }
}
