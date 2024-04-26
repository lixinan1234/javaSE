package com.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/21 20:53
 */
public class Demo5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\李新安\\Desktop\\Java代码\\xdy\\bbb.txt");
        int len;
        byte[] bytes = new byte[5];
        while ((len = fis.read(bytes))!=-1){
            String str = new String(bytes,0,len);
            System.out.print(str);
        }
        fis.close();
    }
}
