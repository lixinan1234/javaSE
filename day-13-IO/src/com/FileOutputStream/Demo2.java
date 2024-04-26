package com.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/20 15:23
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\李新安\\Desktop\\Java代码\\b.txt");
        //2.写入数据
        byte[] arr = {97,98,99,100,101,102};
        fos.write(arr,1,2);
        //3.释放资源
        fos.close();
    }
}
