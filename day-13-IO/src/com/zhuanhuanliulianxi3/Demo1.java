package com.zhuanhuanliulianxi3;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/24 21:57
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定字符编码读取
         */



        FileReader fr = new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\zhuanhuanliu1.txt", Charset.forName("GBK"));
        //2.读取数据
        int len;
        while ((len = fr.read())!=-1){
            System.out.print((char) len);
        }
        fr.close();






    }
}
