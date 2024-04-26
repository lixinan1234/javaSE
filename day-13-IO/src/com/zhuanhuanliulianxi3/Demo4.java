package com.zhuanhuanliulianxi3;

import java.io.*;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/24 22:36
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        /*
             利用字节流读取文件中的数据，每一次读一整行，而且不能出现乱码
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\李新安\\Desktop\\Java代码\\zhuanhuanliu1.txt")));
        String len;
        while ((len = br.readLine())!=null){
            System.out.println(len);
        }
        br.close();
    }
}
