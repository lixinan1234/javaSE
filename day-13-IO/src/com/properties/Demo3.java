package com.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/7 21:02
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        //1.创建集合
        Properties pro = new Properties();
        //2.读取本地Properties文件里面的数据
        BufferedReader br = new BufferedReader(new FileReader("day-13-IO\\a.properties"));
        pro.load(br);//读取
        br.close();

        //3.打印集合
        System.out.println(pro);
    }
}
