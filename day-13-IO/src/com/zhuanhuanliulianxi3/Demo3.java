package com.zhuanhuanliulianxi3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/24 22:23
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
            将本地文件中的GBK文件，转成UTF-8
         */

        FileReader fr = new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\zhuanhuanliu1.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("C:\\Users\\李新安\\Desktop\\Java代码\\zhuanhuanliu1.txt", Charset.forName("UTF-8"));
        int len;
        while ((len = fr.read())!=-1){
            fw.write(len);
        }
        fw.close();
        fr.close();
    }
}
