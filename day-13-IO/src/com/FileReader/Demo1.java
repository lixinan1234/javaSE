package com.FileReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/21 21:15
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //1.创建字符流输入对象
        FileReader fr = new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\copy.txt");
        //2.读取数据
        int len;
        while ((len = fr.read())!=-1){
            System.out.print((char) len);
        }
        //3.释放资源
        fr.close();
    }
}
