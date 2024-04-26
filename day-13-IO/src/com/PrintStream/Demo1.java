package com.PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/26 15:58
 */
public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //1.创建字节打印流的对象
        PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\李新安\\Desktop\\Java代码\\dyl.txt"),true, Charset.forName("UTF-8"));
        //2.写出数据
        ps.println(97);
        ps.print(true);
        ps.println();
        ps.printf("%s 爱上了 %s","阿珍","阿强");
        //3.释放资源
        ps.close();
    }
}
