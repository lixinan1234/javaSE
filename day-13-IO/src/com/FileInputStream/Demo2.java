package com.FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/20 21:29
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        练习：
              文件拷贝
              把C:\\Users\\李新安\\Desktop\\Java代码\\xdy\\hhh.txt拷贝到当前模块
         */

        //1.创建对象
        FileInputStream fis = new FileInputStream("C:\\\\Users\\\\李新安\\\\Desktop\\\\Java代码\\\\xdy\\\\hhh.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\李新安\\Desktop\\Java代码\\copy.txt");
        //2.拷贝
        //核心思想：边读边写
        int b;
        while ((b = fis.read())!=-1){
            fos.write(b);
        }
        //3.释放资源
        //规则：先开的最后关闭
        fos.close();
        fis.close();
    }
}
