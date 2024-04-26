package com.FileReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/21 21:25
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //1.创建字符流输入对象
        FileReader fr = new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\copy.txt");
        //2.读取数据

        char[] chars = new char[10];
        int len;
        while ((len = fr.read(chars))!=-1){
            //把数组中的数据变成字符串再进行打印
            String str = new String(chars,0,len);
            System.out.print(str);
        }
        //3.释放资源
        fr.close();
    }
}
