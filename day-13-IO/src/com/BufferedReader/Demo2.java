package com.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/24 9:08
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
         /*
            字节缓冲输入流
            两个方法：
                     构造方法：
                     newLine() 跨平台的换行
         */
         //1.创建字节缓冲输出流的对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\李新安\\Desktop\\Java代码\\a.txt",true));
        //2.写入数据
        bw.newLine();//换行
        bw.write("你嘴角上扬的样子，百度都搜索不到");
        bw.newLine();//换行
        bw.write("以后如果我结果了你一定要来哦，没有新娘我会很尴尬");
        //3.关流
        bw.close();
    }
}
