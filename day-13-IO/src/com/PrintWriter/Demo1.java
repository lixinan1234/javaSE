package com.PrintWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/26 16:11
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //1.创建字符打印流的对象
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\李新安\\Desktop\\Java代码\\dyl1.txt"),true);
        //2.写出数据
        pw.println("今天你终于叫我名字了，虽然叫错了，但是没关系，我马上改");
        pw.printf("%s 爱上了 %s","阿珍","阿强");
        //3.关流
        pw.close();
    }
}
