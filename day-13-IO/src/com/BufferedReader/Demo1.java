package com.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/24 8:58
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
            字节缓冲输入流
            两个方法：
                     构造方法:
                     readLine() 读取一整行数据，如果没有数据读，返回null

         */

        //1.创建字节缓冲流输入流的对象
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\a.txt"));

        //2.读取数据
        String line;
        while ((line = br.readLine())!=null) {
            System.out.println(line);
        }
        //3.关流
        br.close();

    }
}
