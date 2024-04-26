package com.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/20 15:38
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*

        换行写：
                  再次写出一个换行符就可以了
                  windows:  \r\n
                  Linux:  \n

        续写：

         */

        //1.创建对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\李新安\\Desktop\\Java代码\\b.txt",true);
        //2.写入数据
        String str = "lixinanzhengshuai";
        byte[] bytes = str.getBytes();
        fos.write(bytes);

        String wrap = "\r\n";
        byte[] byte2 = wrap.getBytes();
        fos.write(byte2);

        String str1 = "666";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);


        //3.释放资源
        fos.close();
    }
}
