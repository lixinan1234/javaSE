package com.lianxi1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/22 22:14
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
               /*
              文本文件中有以下的数据：
                 2-1-9-4-7-8
              将文件中的数据进行排序，变成以下数据
                 1-2-4-7-8-9
         */

        //1.读取数据
        FileReader fr = new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\paixu.txt");
        StringBuilder sb = new StringBuilder();
        int len;
        while ((len = fr.read())!=-1){
            sb.append((char)len);
        }
        fr.close();
        System.out.println("原数据："+sb);
        //2.排序
        Integer[] arr = Arrays.stream(sb.toString()
                .split("-"))
                .map(Integer::parseInt).sorted()
                .toArray(Integer[]::new);

        //3.写出
        FileWriter fw = new FileWriter("C:\\Users\\李新安\\Desktop\\Java代码\\paixu.txt");
        String s = Arrays.toString(arr).replace(", ","-");
        String substring = s.substring(1, s.length() - 1);
        fw.write(substring);
        fw.close();

    }
}
