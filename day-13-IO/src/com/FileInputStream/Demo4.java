package com.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/20 22:04
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
                /*
                 一次读一个字节的数组数据
         */

        //1.创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\李新安\\Desktop\\Java代码\\xdy\\bbb.txt");
        //2.读取数据

        byte[] bytes = new byte[5];
        //一次读取多个字节数据，具体读多少，跟数组的长度有关
        //返回值：本次读取到了多少个字节数据
        int len = fis.read(bytes);

        String str = new String(bytes,0,len);
        System.out.println(str);
        //3.释放资源
        fis.close();

    }
}
