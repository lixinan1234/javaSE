package com.zhuanhuanliulianxi3;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/24 22:18
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定字符编码写出
         */

        //1.创建转换流的对象
        FileWriter fw = new FileWriter("C:\\Users\\李新安\\Desktop\\Java代码\\zhuanhuanliu1.txt", Charset.forName("GBK"));
        //2.写出数据
        fw.write("李新安？");
        //3.释放资源
        fw.close();
    }
}
